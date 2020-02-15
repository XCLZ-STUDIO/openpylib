package com.xclz.openpylib.objects.sequence;

import com.xclz.openpylib.abstracts.PyBuffer;
import com.xclz.openpylib.abstracts.PyMapping;
import com.xclz.openpylib.abstracts.PySequence;
import com.xclz.openpylib.objects.basic.PyObject;

public class PyBytes extends PyObject implements PySequence, PyMapping, PyBuffer {
    public static PyBytes From(String str) {
        return _PyBytes.FromString(str);
    }

    public static PyBytes From(PyObject obj) {
        return _PyBytes.FromObject(obj);
    }

    public long size() {
        return _PyBytes.Size(this);
    }

    public long SIZE() {
        return _PyBytes.SIZE(this);
    }

    public String asString() {
        return _PyBytes.AsString(this);
    }

    public String asSTRING() {
        return _PyBytes.AS_STRING(this);
    }

    public void concat(PyBytes newpart) {
        _PyBytes.Concat(this, newpart);
    }

    public void concatAndDel(PyBytes newpart) {
        _PyBytes.ConcatAndDel(this, newpart);
    }
}

class _PyBytes {
    //TODO int PyBytes_Check(PyObject *o)
    //TODO int PyBytes_CheckExact(PyObject *o)
    public static native PyBytes FromString(String str);

    //TODO PyObject* PyBytes_FromFormat(const char *format, ...)
    public static native PyBytes FromObject(PyObject obj);

    public static native long Size(PyBytes obj);

    public static native long SIZE(PyBytes obj);

    public static native String AsString(PyObject obj);

    public static native String AS_STRING(PyObject obj);

    public static native void Concat(PyBytes bytes, PyBytes newpart);

    public static native void ConcatAndDel(PyBytes bytes, PyBytes newpart);
}