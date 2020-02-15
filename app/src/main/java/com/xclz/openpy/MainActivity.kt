package com.xclz.openpy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xclz.openpylib.python.Py
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Py.tempFunction(File(filesDir, "python_home").absolutePath)
        Py.Initialize()
        center_text.text = "Is initialized: ${Py.IsInitialized()}"
    }


}
