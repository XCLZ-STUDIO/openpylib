package com.xclz.openpylib.abstracts;

import com.xclz.openpylib.objects.basic.PyObject;

public interface PyIter extends PyBase {
    static PyIter Check(PyObject obj) {
        return _PyIter.Check(obj);
    }

    default PyObject next() {
        return _PyIter.Next(this);
    }
}

class _PyIter {
    public static native PyIter Check(PyObject obj);

    public static native PyObject Next(PyIter obj);
}