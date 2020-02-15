package com.xclz.openpylib.python;

import com.xclz.openpylib.objects.basic.PyObject;

public class Py {
    static {
        System.loadLibrary("openpylib");
    }

    //TODO consider to add PyNone_Check
    public static PyObject None() {
        PyObject none = getNone();
        _Incref(none);  //TODO do this in jni function
        return none;
    }

    public static native void _Incref(PyObject obj);    //TODO use this when python function stolen a ref count or return a borrowed ref

    public static native void _Decref(PyObject obj);

    public static native void tempFunction(String path);

    public static native void Initialize();

    public static native void InitializeEx(int initsigs);

    public static native boolean IsInitialized();

    public static native boolean FinalizeEx();

    public static native void Finalize();

    private static native PyObject getNone();
}
