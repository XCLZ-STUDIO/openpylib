package com.xclz.openpylib.objects.sequence;

import com.xclz.openpylib.abstracts.PyBuffer;
import com.xclz.openpylib.abstracts.PyMapping;
import com.xclz.openpylib.abstracts.PySequence;
import com.xclz.openpylib.objects.basic.PyObject;

public class PyByteArray extends PyObject implements PySequence, PyMapping, PyBuffer {
    public static PyByteArray From(PyObject obj) {
        return _PyByteArray.FromObject(obj);
    }

    public static PyByteArray From(String str, long len) {
        return _PyByteArray.FromStringAndSize(str, len);
    }

    public PyByteArray concat(PyByteArray newpart) {
        return _PyByteArray.Concat(this, newpart);
    }

    public long size() {
        return _PyByteArray.Size(this);
    }

    public String asString() {
        return _PyByteArray.AsString(this);
    }

    public int resize(long len) {
        return _PyByteArray.Resize(this, len);
    }
}

class _PyByteArray {
    //TODO int PyByteArray_Check(PyObject *o)
    //TODO int PyByteArray_CheckExact(PyObject *o)
    public static native PyByteArray FromObject(PyObject obj);

    public static native PyByteArray FromStringAndSize(String str, long len);

    public static native PyByteArray Concat(PyObject a, PyObject b);

    public static native long Size(PyByteArray obj);

    public static native String AsString(PyByteArray obj);

    public static native int Resize(PyByteArray obj, long len);
}
