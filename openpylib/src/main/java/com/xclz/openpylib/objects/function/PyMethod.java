package com.xclz.openpylib.objects.function;

import com.xclz.openpylib.abstracts.PyCallable;
import com.xclz.openpylib.objects.basic.PyObject;

public class PyMethod extends PyObject implements PyCallable {
    public static PyMethod New(PyCallable func, PyObject self) {
        return _PyMethod.New(func, self);
    }

    public static int ClearFreeList() {
        return _PyMethod.ClearFreeList();
    }

    public PyFunction Function() {
        return _PyMethod.Function(this);
    }

    public PyFunction GET_FUNCTION() {
        return _PyMethod.GET_FUNCTION(this);
    }

    public PyObject Self() {
        return _PyMethod.Self(this);
    }

    public PyObject GET_SELF() {
        return _PyMethod.GET_SELF(this);
    }
}

class _PyMethod {
    //TODO int PyMethod_Check(PyObject *o)
    public static native PyMethod New(PyCallable func, PyObject self);

    public static native PyFunction Function(PyMethod obj); //TODO incref

    public static native PyFunction GET_FUNCTION(PyMethod obj); //TODO incref

    public static native PyObject Self(PyMethod obj); //TODO incref

    public static native PyObject GET_SELF(PyMethod obj); //TODO incref

    public static native int ClearFreeList();
}