package com.xclz.openpylib.abstracts;

import com.xclz.openpylib.objects.basic.PyObject;

//TODO implement
public interface PySequence {
    default long Size() {
        return _PySequence.Size(this);
    }

}

class _PySequence {
    public static native long Size(PySequence o);

    public static native long Length(PySequence o);

    public static native PyObject Concat(PyObject o1, PyObject o2);

    public static native PyObject Repeat(PyObject o, long count);

    public static native PyObject InPlaceConcat(PyObject o1, PyObject o2);

    public static native PyObject InPlaceRepeat(PyObject o, long count);

    public static native PyObject GetItem(PyObject o, long index);

    public static native PyObject GetSlice(PyObject o, long index1, long index2);

    public static native boolean SetItem(PyObject o, long index, PyObject value);

    public static native boolean DelItem(PyObject o, long index);

    public static native boolean SetSlice(PyObject o, long index1, long index2, PyObject value);

    public static native long Count(PyObject o, PyObject value);

    public static native boolean Contains(PyObject o, PyObject value);

    public static native long Index(PyObject o, PyObject value);

    public static native PyObject List(PyObject o);

    public static native PyObject Tuple(PyObject o);

    public static native PyObject Fast(PyObject o, String m);

    public static native PyObject Fast_GET_SIZE(PyObject o);

    public static native PyObject Fast_GET_ITEM(PyObject o, long index);

    public static native PyObject Fast_ITEMS(PyObject o);

    public static native PyObject ITEM(PyObject o, long index);
}
