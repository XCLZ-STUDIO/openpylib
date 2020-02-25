package com.xclz.openpylib.abstracts;

import com.xclz.openpylib.objects.basic.PyObject;
import com.xclz.openpylib.objects.sequence.PyList;
import com.xclz.openpylib.objects.sequence.PyTuple;

public interface PySequence {
    static PySequence Check(PyObject o) {
        return _PySequence.Check(o);
    }

    static long Size(PySequence obj) {
        return _PySequence.Size(obj);
    }

    static long Length(PySequence obj) {
        return _PySequence.Length(obj);
    }

    static PySequence Concat(PySequence o1, PySequence o2) {
        return _PySequence.Concat(o1, o2);
    }

    static PySequence Repeat(PySequence o, long count) {
        return _PySequence.Repeat(o, count);
    }

    static PySequence InConcat(PySequence o1, PySequence o2) {
        return _PySequence.InPlaceConcat(o1, o2);
    }

    static PySequence InRepeat(PySequence o, long count) {
        return _PySequence.InPlaceRepeat(o, count);
    }

    static PyObject GetItem(PySequence o, long index) {
        return _PySequence.GetItem(o, index);
    }

    static PySequence GetSlice(PySequence o, long index1, long index2) {
        return _PySequence.GetSlice(o, index1, index2);
    }

    static boolean SetItem(PySequence o, long index, PyObject value) {
        return _PySequence.SetItem(o, index, value);
    }

    static boolean DelItem(PySequence o, long index) {
        return _PySequence.DelItem(o, index);
    }

    static boolean SetSlice(PySequence o, long index1, long index2, PySequence value) {
        return _PySequence.SetSlice(o, index1, index2, value);
    }

    static long Count(PySequence o, PyObject value) {
        return _PySequence.Count(o, value);
    }

    static boolean Contains(PySequence o, PyObject value) {
        return _PySequence.Contains(o, value);
    }

    static long Index(PySequence o, PyObject value) {
        return _PySequence.Index(o, value);
    }

    static PyList List(PySequence o) {
        return _PySequence.List(o);
    }

    static PyTuple Tuple(PySequence o) {
        return _PySequence.Tuple(o);
    }

    // static PyObject Fast(PyObject o, String m) {
    //     return _PySequence.Fast();
    // }

    // static PyObject Fast_GET_SIZE(PyObject o) {
    //     return _PySequence.Fast_GET_SIZE();
    // }

    // static PyObject Fast_GET_ITEM(PyObject o, long index) {
    //     return _PySequence.Fast_GET_ITEM();
    // }

    // static PyObject Fast_ITEMS(PyObject o) {
    //     return _PySequence.Fast_ITEMS();
    // }

    // static PyObject ITEM(PyObject o, long index) {
    //     return _PySequence.ITEM();
    // }


    default long size() {
        return Size(this);
    }

    default long length() {
        return Length(this);
    }

    default PySequence concat(PySequence other) {
        return Concat(this, other);
    }

    default PySequence repeat(long count) {
        return Repeat(this, count);
    }

    default PySequence inConcat(PySequence other) {
        return InConcat(this, other);
    }

    default PySequence inRepeat(long count) {
        return InRepeat(this, count);
    }

    default PyObject getItem(long index) {
        return GetItem(this, index);
    }

    default PySequence getSlice(long index1, long index2) {
        return GetSlice(this, index1, index2);
    }

    default boolean setItem(long index, PyObject value) {
        return SetItem(this, index, value);
    }

    default boolean delItem(long index) {
        return DelItem(this, index);
    }

    default boolean setSlice(long index1, long index2, PySequence value) {
        return SetSlice(this, index1, index2, value);
    }

    default long count(PyObject value) {
        return Count(this, value);
    }

    default boolean contains(PyObject value) {
        return Contains(this, value);
    }

    default long index(PyObject value) {
        return Index(this, value);
    }

    default PyList list() {
        return List(this);
    }

    default PyTuple tuple() {
        return Tuple(this);
    }

    //TODO implement these
    // default PyObject Fast(PyObject o, String m) {
    //     return Fast(this);
    // }
    // default PyObject Fast_GET_SIZE(PyObject o) {
    //     return Fast_GET_SIZE(this);
    // }
    // default PyObject Fast_GET_ITEM(PyObject o, long index) {
    //     return Fast_GET_ITEM(this);
    // }
    // default PyObject Fast_ITEMS(PyObject o) {
    //     return Fast_ITEMS(this);
    // }
    // default PyObject ITEM(PyObject o, long index) {
    //     return ITEM(this);
    // }

}

class _PySequence extends PyObject implements PySequence {
    public static native PySequence Check(PyObject o);
    public static native long Size(PySequence o);
    public static native long Length(PySequence o);
    public static native PySequence Concat(PySequence o1, PySequence o2);
    public static native PySequence Repeat(PySequence o, long countPySequence);
    public static native PySequence InPlaceConcat(PySequence o1, PySequence o2);
    public static native PySequence InPlaceRepeat(PySequence o, long countPySequence);
    public static native PyObject GetItem(PySequence o, long index);
    public static native PySequence GetSlice(PySequence o, long index1, long index2);
    public static native boolean SetItem(PySequence o, long index, PyObject value);
    public static native boolean DelItem(PySequence o, long index);
    public static native boolean SetSlice(PySequence o, long index1, long index2, PySequence value);
    public static native long Count(PySequence o, PyObject value);
    public static native boolean Contains(PySequence o, PyObject value);
    public static native long Index(PySequence o, PyObject value);
    public static native PyList List(PySequence o);
    public static native PyTuple Tuple(PySequence o);
    // public static native PyObject Fast(PyObject o, String m);
    // public static native PyObject Fast_GET_SIZE(PyObject o);
    // public static native PyObject Fast_GET_ITEM(PyObject o, long index);
    // public static native PyObject Fast_ITEMS(PyObject o);
    // public static native PyObject ITEM(PyObject o, long index);
}
