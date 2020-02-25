package com.xclz.openpylib.objects.sequence;

import com.xclz.openpylib.abstracts.PyMapping;
import com.xclz.openpylib.abstracts.PySequence;
import com.xclz.openpylib.objects.basic.PyObject;

public class PyTuple extends PyObject implements PySequence, PyMapping {
    public static native PyTuple Check(PyObject obj);
    public static native PyTuple CheckExact(PyObject obj);
    public static native PyTuple New(long len);
    public static native PyTuple Pack(PyObject... items);
    public static native long Size(PyTuple obj);
    public static native long SIZE(PyTuple obj);
    public static native PyObject GetItem(PyTuple obj, long pos); //TODO incref
    public static native PyObject GET_ITEM(PyTuple obj, long pos); //TODO incref
    public static native PyTuple GetSlice(PyTuple obj, long low, long high);
    public static native boolean SetItem(PyTuple obj, long pos, PyObject value); //TODO incref
    public static native void SET_ITEM(PyTuple obj, long pos, PyObject value); //TODO incref
    //TODO int _PyTuple_Resize(PyObject **p, Py_ssize_t newsize)
    public static native int ClearFreeList();

    public long size() {
        return Size(this);
    }

    public long SIZE() {
        return SIZE(this);
    }

    public PyObject getItem(long pos) {
        return GetItem(this, pos);
    }

    public PyObject getITEM(long pos) {
        return GET_ITEM(this, pos);
    }

    public PyTuple getSlice(long low, long high) {
        return GetSlice(this, low, high);
    }

    public boolean setItem(long pos, PyObject value) {
        return SetItem(this, pos, value);
    }

    public void setITEM(long pos, PyObject value) {
        SET_ITEM(this, pos, value);
    }
}