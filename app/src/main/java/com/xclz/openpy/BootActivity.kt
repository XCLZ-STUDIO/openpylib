package com.xclz.openpy

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import androidx.appcompat.app.AppCompatActivity
import com.xclz.openpylib.python.PyTool
import java.io.File
import kotlin.concurrent.thread

class BootActivity : AppCompatActivity() {
    companion object {
        const val MSG_UNZIP_OVER = 0x01
    }

    private val mHandler = object : Handler(Looper.getMainLooper()) {
        override fun handleMessage(msg: Message) {
            when (msg.what) {
                MSG_UNZIP_OVER -> {
                    val setting = getSharedPreferences("setting", Context.MODE_PRIVATE)
                    val editor = setting.edit()
                    editor.putBoolean("first_run", false)
                    editor.apply()
                    jump2Main()
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boot)

        init()
    }


    private fun init() {
        val setting = getSharedPreferences("setting", Context.MODE_PRIVATE)
        val firstRun = setting.getBoolean("first_run", true)
        if (firstRun) {
            val arch = System.getProperty("os.arch")
            if (arch == null) {
                //TODO raise error
            }

            thread {
                PyTool.unzipResource(
                    this,
                    "python3.8_${arch}.zip",
                    File(filesDir, "python_home/lib/python3.8")
                )
                mHandler.sendEmptyMessage(MSG_UNZIP_OVER)
            }
        } else {
            jump2Main()
        }
    }

    private fun jump2Main() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
