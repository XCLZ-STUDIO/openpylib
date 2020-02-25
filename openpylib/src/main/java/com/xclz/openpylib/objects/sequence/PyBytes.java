package com.xclz.openpylib.objects.sequence;

import com.xclz.openpylib.abstracts.PyBuffer;
import com.xclz.openpylib.abstracts.PyMapping;
import com.xclz.openpylib.abstracts.PySequence;
import com.xclz.openpylib.objects.basic.PyObject;

public class PyBytes extends PyObject implements PySequence, PyMapping, PyBuffer {
    public static native PyBytes Check(PyObject obj);
    public static native PyBytes CheckExact(PyObject obj);
    public static native PyBytes FromString(String str);
    //TODO PyObject* PyBytes_FromFormat(const char *format, ...)
    public static native PyBytes FromObject(PyObject obj);
    public static native long Size(PyBytes obj);
    public static native long SIZE(PyBytes obj);
    public static native String AsString(PyObject obj);
    public static native String AS_STRING(PyObject obj);
    public static native void Concat(PyBytes bytes, PyBytes newpart);
    //deprecated: public static native void ConcatAndDel(PyBytes bytes, PyBytes newpart);

    public static PyBytes From(String str) {
        return FromString(str);
    }

    public static PyBytes From(PyObject obj) {
        return FromObject(obj);
    }

    public long size() {
        return Size(this);
    }

    public long SIZE() {
        return SIZE(this);
    }

    public String asString() {
        return AsString(this);
    }

    public String asSTRING() {
        return AS_STRING(this);
    }

    public void concat(PyBytes newpart) {
        Concat(this, newpart);
    }

//    public void concatAndDel(PyBytes newpart) {
//        ConcatAndDel(this, newpart);
//    }
}