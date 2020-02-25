package com.xclz.openpylib.objects.number;

import com.xclz.openpylib.abstracts.PyNumber;
import com.xclz.openpylib.objects.basic.PyObject;

public class PyFloat extends PyObject implements PyNumber {
    public static native PyFloat Check(PyObject obj);    
    public static native PyFloat CheckExact(PyObject obj);
    public static native PyFloat FromString(PyObject str);
    public static native PyFloat FromDouble(double v);
    public static native double AsDouble(PyFloat obj);
    public static native double AS_DOUBLE(PyFloat obj);
    public static native PyObject GetInfo();
    public static native double GetMax();
    public static native double GetMin();
    public static native int ClearFreeList();

    public static PyFloat From(PyObject str) {
        return FromString(str);
    }

    public static PyFloat From(double v) {
        return FromDouble(v);
    }

    public double asDouble() {
        return AsDouble(this);
    }

    public double asDOUBLE() {
        return AS_DOUBLE(this);
    }
}