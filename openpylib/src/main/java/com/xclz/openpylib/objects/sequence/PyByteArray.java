package com.xclz.openpylib.objects.sequence;

import com.xclz.openpylib.abstracts.PyBuffer;
import com.xclz.openpylib.abstracts.PyMapping;
import com.xclz.openpylib.abstracts.PySequence;
import com.xclz.openpylib.objects.basic.PyObject;

public class PyByteArray extends PyObject implements PySequence, PyMapping, PyBuffer {
    public static native PyByteArray Check(PyObject obj);
    public static native PyByteArray CheckExact(PyObject obj);
    public static native PyByteArray FromObject(PyObject obj);
    public static native PyByteArray FromString(String str);
    public static native PyByteArray Concat(PyObject a, PyObject b);
    public static native long Size(PyByteArray obj);
    public static native String AsString(PyByteArray obj);
    public static native int Resize(PyByteArray obj, long len);

    public static PyByteArray From(PyObject obj) {
        return FromObject(obj);
    }

    public static PyByteArray From(String str) {
        return FromString(str);
    }

    public PyByteArray concat(PyByteArray newpart) {
        return Concat(this, newpart);
    }

    public long size() {
        return Size(this);
    }

    public String asString() {
        return AsString(this);
    }

    public int resize(long len) {
        return Resize(this, len);
    }
}