package com.xclz.openpylib.objects.number;

import com.xclz.openpylib.abstracts.PyNumber;
import com.xclz.openpylib.objects.basic.PyObject;

public class PyFloat extends PyObject implements PyNumber {
    public static PyFloat From(PyObject str) {
        return _PyFloat.FromString(str);
    }

    public static PyFloat From(double v) {
        return _PyFloat.FromDouble(v);
    }

    public static PyObject GetInfo() {
        return _PyFloat.GetInfo();
    }

    public static double GetMax() {
        return _PyFloat.GetMax();
    }

    public static double GetMin() {
        return _PyFloat.GetMin();
    }

    public static int ClearFreeList() {
        return _PyFloat.ClearFreeList();
    }

    public double AsDouble() {
        return _PyFloat.AsDouble(this);
    }

    public double AS_DOUBLE() {
        return _PyFloat.AS_DOUBLE(this);
    }
}

class _PyFloat {
    //TODO int PyFloat_Check(PyObject *p)
    //TODO int PyFloat_CheckExact(PyObject *p)
    public static native PyFloat FromString(PyObject str);

    public static native PyFloat FromDouble(double v);

    public static native double AsDouble(PyFloat obj);

    public static native double AS_DOUBLE(PyFloat obj);

    public static native PyObject GetInfo();

    public static native double GetMax();

    public static native double GetMin();

    public static native int ClearFreeList();
}