package com.xclz.openpylib.objects.function;

import com.xclz.openpylib.objects.basic.PyObject;

public class PyCell extends PyObject {
    public static PyCell New(PyObject obj) {
        return _PyCell.New(obj);
    }

    public PyObject Get() {
        return _PyCell.Get(this);
    }

    public PyObject GET() {
        return _PyCell.GET(this);
    }

    public boolean Set(PyObject value) {
        return _PyCell.Set(this, value);
    }

    public void SET(PyObject value) {
        _PyCell.SET(this, value);
    }
}

class _PyCell {
    //TODO int PyCell_Check(ob)
    public static native PyCell New(PyObject obj);

    public static native PyObject Get(PyCell cell);

    public static native PyObject GET(PyCell cell); //TODO incref

    public static native boolean Set(PyCell cell, PyObject value);

    public static native void SET(PyCell cell, PyObject value);
}