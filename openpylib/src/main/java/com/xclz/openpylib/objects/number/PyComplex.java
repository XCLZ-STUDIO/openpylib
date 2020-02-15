package com.xclz.openpylib.objects.number;

import com.xclz.openpylib.abstracts.PyNumber;
import com.xclz.openpylib.objects.basic.PyObject;

public class PyComplex extends PyObject implements PyNumber {
    public static PyComplex From(double real, double imag) {
        return _PyComplex.FromDoubles(real, imag);
    }

    public double RealAsDouble() {
        return _PyComplex.RealAsDouble(this);
    }

    public double ImagAsDouble() {
        return _PyComplex.ImagAsDouble(this);
    }
}

class _PyComplex {
    //TODO int PyComplex_Check(PyObject *p)
    //TODO int PyComplex_CheckExact(PyObject *p)
    //TODO PyObject* PyComplex_FromCComplex(Py_complex v)
    public static native PyComplex FromDoubles(double real, double imag);

    public static native double RealAsDouble(PyComplex obj);

    public static native double ImagAsDouble(PyComplex obj);
    //TODO Py_complex PyComplex_AsCComplex(PyObject *op)
}