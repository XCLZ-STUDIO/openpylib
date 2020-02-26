package com.xclz.openpylib.abstracts;

import com.xclz.openpylib.objects.basic.PyObject;
import com.xclz.openpylib.objects.container.PyDict;
import com.xclz.openpylib.objects.sequence.PyTuple;

public interface PyCallable {
    static PyCallable Check(PyObject obj) {
        return _PyCallable.Check(obj);
    }

    static PyObject Call(PyCallable callable, PyTuple args, PyDict kwargs) {
        return _PyCallable.Call(callable, args, kwargs);
    }

    static PyObject Call(PyCallable callable, PyTuple args) {
        return _PyCallable.CallObject(callable, args);
    }

    static PyObject Call(PyCallable callable, PyObject... args) {
        return Call(callable, PyTuple.Pack(args));
    }


    default PyObject call(PyTuple args, PyDict kwargs) {
        return Call(this, args, kwargs);
    }

    default PyObject call(PyTuple args) {
        return Call(this, args);
    }

    default PyObject call(PyObject... args) {
        return Call(this, args);
    }
}

class _PyCallable {
    public static native PyCallable Check(PyObject obj);
    public static native PyObject Call(PyCallable callable, PyTuple args, PyDict kwargs);
    public static native PyObject CallObject(PyCallable callable, PyTuple args);
}