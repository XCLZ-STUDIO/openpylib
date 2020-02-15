package com.xclz.openpylib.objects.number;

import com.xclz.openpylib.abstracts.PyNumber;
import com.xclz.openpylib.objects.basic.PyObject;
import com.xclz.openpylib.objects.sequence.PyUnicode;

//TODO implement PyBool
public class PyLong extends PyObject implements PyNumber {
    public static PyLong From(long value) {
        return _PyLong.FromLong(value);
    }

    public static PyLong From(double value) {
        return _PyLong.FromDouble(value);
    }

    public static PyLong From(String str, int base) {
        return _PyLong.FromString(str, base);
    }

    public static PyLong From(char[] unicode, long length, int base) {
        return _PyLong.FromUnicode(unicode, length, base);
    }

    public static PyLong From(PyUnicode unicode, int base) {
        return _PyLong.FromUnicodeObject(unicode, base);
    }

    public long AsLong() {
        return _PyLong.AsLong(this);
    }

    public double AsDouble() {
        return _PyLong.AsDouble(this);
    }
}

class _PyLong {
    //TODO int PyLong_Check(PyObject *p)
    //TODO int PyLong_CheckExact(PyObject *p)

    public static native PyLong FromLong(long v);

    public static native PyLong FromDouble(double v);

    public static native PyLong FromString(String str, int base); //TODO research pend: PyObject* PyLong_FromString(const char *str, char **pend, int base)

    public static native PyLong FromUnicode(char[] u, long length, int base);

    public static native PyLong FromUnicodeObject(PyUnicode u, int base);

    public static native long AsLong(PyLong obj);

    //TODO long PyLong_AsLongAndOverflow(PyObject *obj, int *overflow)
    public static native double AsDouble(PyLong obj);
}