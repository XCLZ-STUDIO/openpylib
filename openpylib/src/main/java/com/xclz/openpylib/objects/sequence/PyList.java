package com.xclz.openpylib.objects.sequence;

import com.xclz.openpylib.abstracts.PyMapping;
import com.xclz.openpylib.abstracts.PySequence;
import com.xclz.openpylib.objects.basic.PyObject;

public class PyList extends PyObject implements PySequence, PyMapping {
    public static native PyList Check(PyObject obj);
    public static native PyList CheckExact(PyObject obj);
    public static native PyList New(long len);
    public static native long Size(PyList obj);
    public static native long SIZE(PyList obj);
    public static native PyObject GetItem(PyList obj, long i);
    public static native PyObject GET_ITEM(PyList obj, long i);
    public static native boolean SetItem(PyList obj, long i, PyObject item);
    public static native void SET_ITEM(PyList obj, long i, PyObject item);
    public static native boolean Insert(PyList obj, long i, PyObject item);
    public static native boolean Append(PyList obj, PyObject item);
    public static native PyObject GetSlice(PyList obj, long low, long high);
    public static native boolean SetSlice(PyList obj, long low, long high, PySequence itemlist);
    public static native boolean Sort(PyList obj);
    public static native boolean Reverse(PyList obj);
    public static native PyTuple AsTuple(PyList obj);
    public static native int ClearFreeList();

    public long size() {
        return Size(this);
    }

    public long SIZE() {
        return SIZE(this);
    }

    public PyObject getItem(long i) {
        return GetItem(this, i);
    }

    public PyObject getITEM(long i) {
        return GET_ITEM(this, i);
    }

    public boolean etItem(long i, PyObject item) {
        return SetItem(this, i, item);
    }

    public void setITEM(long i, PyObject item) {
        SET_ITEM(this, i, item);
    }

    public boolean insert(long i, PyObject item) {
        return Insert(this, i, item);
    }

    public boolean append(PyObject item) {
        return Append(this, item);
    }

    public PyObject getSlice(long low, long high) {
        return GetSlice(this, low, high);
    }

    public boolean setSlice(long low, long high, PySequence items) {
        return SetSlice(this, low, high, items);
    }

    public boolean sort() {
        return Sort(this);
    }

    public boolean reverse() {
        return Reverse(this);
    }

    public PyTuple asTuple() {
        return AsTuple(this);
    }
}