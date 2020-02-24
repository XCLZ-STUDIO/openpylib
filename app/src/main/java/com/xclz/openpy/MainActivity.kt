package com.xclz.openpy

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.xclz.openpylib.objects.sequence.PyList
import com.xclz.openpylib.python.Py
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Py.tempFunction(File(filesDir, "python_home").absolutePath)
        Py.Initialize()

        val list = PyList.New(5)
        Log.e("AndroidRuntime[X_Tu]", list.hasAttr("test").toString())
//        center_text.text = "PyList Size: ${list.size()}"
    }


}
