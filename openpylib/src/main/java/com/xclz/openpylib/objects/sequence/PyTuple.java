package com.xclz.openpylib.objects.sequence;

import com.xclz.openpylib.abstracts.PyMapping;
import com.xclz.openpylib.abstracts.PySequence;
import com.xclz.openpylib.objects.basic.PyObject;

public class PyTuple extends PyObject implements PySequence, PyMapping {
    public static PyTuple New(long len) {
        return _PyTuple.New(len);
    }

    public static PyTuple Pack(PyObject[] items) {
        return _PyTuple.Pack(items);
    }

    public static int ClearFreeList() {
        return _PyTuple.ClearFreeList();
    }

    public long size() {
        return _PyTuple.Size(this);
    }

    public long SIZE() {
        return _PyTuple.SIZE(this);
    }

    public PyObject getItem(long pos) {
        return _PyTuple.GetItem(this, pos);
    }

    public PyObject getITEM(long pos) {
        return _PyTuple.GET_ITEM(this, pos);
    }

    public PyObject getSlice(long low, long high) {
        return _PyTuple.GetSlice(this, low, high);
    }

    public boolean setItem(long pos, PyObject value) {
        return _PyTuple.SetItem(this, pos, value);
    }

    public void setITEM(long pos, PyObject value) {
        _PyTuple.SET_ITEM(this, pos, value);
    }
}

class _PyTuple {
    //TODO int PyTuple_Check(PyObject *p)
    //TODO int PyTuple_CheckExact(PyObject *p)
    public static native PyTuple New(long len);

    public static native PyTuple Pack(PyObject[] items);

    public static native long Size(PyTuple obj);

    public static native long SIZE(PyTuple obj);

    public static native PyObject GetItem(PyTuple obj, long pos); //TODO incref

    public static native PyObject GET_ITEM(PyTuple obj, long pos); //TODO incref

    public static native PyObject GetSlice(PyTuple obj, long low, long high);

    public static native boolean SetItem(PyTuple obj, long pos, PyObject value); //TODO incref

    public static native void SET_ITEM(PyTuple obj, long pos, PyObject value); //TODO incref

    //TODO int _PyTuple_Resize(PyObject **p, Py_ssize_t newsize)
    public static native int ClearFreeList();
}