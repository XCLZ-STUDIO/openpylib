package com.xclz.openpylib.objects.sequence;

import com.xclz.openpylib.abstracts.PyMapping;
import com.xclz.openpylib.abstracts.PySequence;
import com.xclz.openpylib.objects.basic.PyObject;

public class PyList extends PyObject implements PySequence, PyMapping {

    public static PyList New(long len) {
        return _PyList.New(len);
    }

    public static int ClearFreeList() {
        return _PyList.ClearFreeList();
    }

    public long size() {
        return _PyList.Size(this);
    }

    public long SIZE() {
        return _PyList.SIZE(this);
    }

    public PyObject getItem(long i) {
        return _PyList.GetItem(this, i);
    }

    public PyObject getITEM(long i) {
        return _PyList.GET_ITEM(this, i);
    }

    public boolean etItem(long i, PyObject item) {
        return _PyList.SetItem(this, i, item);
    }

    public void setITEM(long i, PyObject item) {
        _PyList.SET_ITEM(this, i, item);
    }

    public boolean insert(long i, PyObject item) {
        return _PyList.Insert(this, i, item);
    }

    public boolean append(PyObject item) {
        return _PyList.Append(this, item);
    }

    public PyObject getSlice(long low, long high) {
        return _PyList.GetSlice(this, low, high);
    }

    public boolean setSlice(long low, long high, PyObject... items) {
        return _PyList.SetSlice(this, low, high, items);
    }

    public boolean sort() {
        return _PyList.Sort(this);
    }

    public boolean reverse() {
        return _PyList.Reverse(this);
    }

    public PyTuple asTuple() {
        return _PyList.AsTuple(this);
    }

}

class _PyList {
    public static native PyList PyList_Check(PyObject p);

    public static native PyList PyList_CheckExact(PyObject p);

    public static native PyList New(long len);

    public static native long Size(PyList obj);

    public static native long SIZE(PyList obj);

    public static native PyObject GetItem(PyList obj, long i); //TODO incref

    public static native PyObject GET_ITEM(PyList obj, long i); //TODO incref

    public static native boolean SetItem(PyList obj, long i, PyObject item); //TODO incref

    public static native void SET_ITEM(PyList obj, long i, PyObject item); //TODO incref

    public static native boolean Insert(PyList obj, long i, PyObject item);

    public static native boolean Append(PyList obj, PyObject item);

    public static native PyObject GetSlice(PyList obj, long low, long high);

    public static native boolean SetSlice(PyList obj, long low, long high, PyObject[] items);

    public static native boolean Sort(PyList obj);

    public static native boolean Reverse(PyList obj);

    public static native PyTuple AsTuple(PyList obj);

    public static native int ClearFreeList();
}