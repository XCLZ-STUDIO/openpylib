package com.xclz.openpylib.objects.function;

import com.xclz.openpylib.abstracts.PyCallable;
import com.xclz.openpylib.objects.basic.PyObject;

public class PyInstanceMethod extends PyObject implements PyCallable {
    public static PyInstanceMethod New(PyCallable callable) {
        return _PyInstanceMethod.New(callable);
    }

    public PyFunction function() {
        return _PyInstanceMethod.Function(this);
    }

    public PyFunction FUNCTION() {
        return _PyInstanceMethod.GET_FUNCTION(this);
    }
}

class _PyInstanceMethod {
    //TODO int PyInstanceMethod_Check(PyObject *o)
    public static native PyInstanceMethod New(PyCallable callable);

    public static native PyFunction Function(PyInstanceMethod obj); //TODO incref

    public static native PyFunction GET_FUNCTION(PyInstanceMethod obj); //TODO incref
}