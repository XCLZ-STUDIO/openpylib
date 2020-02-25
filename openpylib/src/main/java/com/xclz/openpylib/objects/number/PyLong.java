package com.xclz.openpylib.objects.number;

import com.xclz.openpylib.abstracts.PyNumber;
import com.xclz.openpylib.objects.basic.PyObject;
import com.xclz.openpylib.objects.sequence.PyUnicode;

//TODO implement PyBool
public class PyLong extends PyObject implements PyNumber {
    public static native PyLong Check(PyObject obj);
    public static native PyLong CheckExact(PyObject obj);
    public static native PyLong FromLong(long v);
    public static native PyLong FromDouble(double v);
    //TODO research pend: PyObject* PyLong_FromString(const char *str, char **pend, int base)
    public static native PyLong FromUnicodeObject(PyUnicode u, int base);
    public static native long AsLong(PyLong obj);
    //TODO long PyLong_AsLongAndOverflow(PyObject *obj, int *overflow)
    public static native double AsDouble(PyLong obj);

    public static PyLong From(long value) {
        return FromLong(value);
    }

    public static PyLong From(double value) {
        return FromDouble(value);
    }

//    public static PyLong From(String str, int base) {
//        return FromString(str, base);
//    }

    public static PyLong From(PyUnicode unicode, int base) {
        return FromUnicodeObject(unicode, base);
    }

    public long AsLong() {
        return AsLong(this);
    }

    public double AsDouble() {
        return AsDouble(this);
    }
}