package com.xclz.openpylib.objects.function;

import com.xclz.openpylib.abstracts.PyCallable;
import com.xclz.openpylib.objects.basic.PyObject;
import com.xclz.openpylib.objects.container.PyDict;
import com.xclz.openpylib.objects.other.PyModule;
import com.xclz.openpylib.objects.sequence.PyTuple;
import com.xclz.openpylib.objects.sequence.PyUnicode;

public class PyFunction extends PyObject implements PyCallable {
    public static PyFunction New(PyCode code, PyDict globals) {
        return _PyFunction.New(code, globals);
    }

    public static PyFunction NewWithQualName(PyCode code, PyDict globals, PyUnicode qualname) {
        return _PyFunction.NewWithQualName(code, globals, qualname);
    }


    public PyCode getCode() {
        return _PyFunction.GetCode(this);
    }

    public PyDict getGlobals() {
        return _PyFunction.GetGlobals(this);
    }

    public PyModule getModule() {
        return _PyFunction.GetModule(this);
    }

    public PyTuple getDefaults() {
        return _PyFunction.GetDefaults(this);
    }

    public boolean setDefaults(PyTuple defaults) {
        return _PyFunction.SetDefaults(this, defaults);
    }

    public PyTuple getClosure() {
        return _PyFunction.GetClosure(this);
    }

    public boolean setClosure(PyTuple closure) {
        return _PyFunction.SetClosure(this, closure);
    }

    public PyDict getAnnotations() {
        return _PyFunction.GetAnnotations(this);
    }

    public boolean setAnnotations(PyDict annotations) {
        return _PyFunction.SetAnnotations(this, annotations);
    }
}

class _PyFunction {
    //TODO int PyFunction_Check(PyObject *o)
    public static native PyFunction New(PyCode code, PyDict globals);

    public static native PyFunction NewWithQualName(PyCode code, PyDict globals, PyUnicode qualname);

    public static native PyCode GetCode(PyFunction obj); //TODO incref

    public static native PyDict GetGlobals(PyFunction obj); //TODO incref

    public static native PyModule GetModule(PyFunction obj); //TODO incref

    public static native PyTuple GetDefaults(PyFunction obj); //TODO incref

    public static native boolean SetDefaults(PyFunction obj, PyTuple defaults);

    public static native PyTuple GetClosure(PyFunction obj); //TODO incref

    public static native boolean SetClosure(PyFunction obj, PyTuple closure);

    public static native PyDict GetAnnotations(PyFunction obj); //TODO incref

    public static native boolean SetAnnotations(PyFunction obj, PyDict annotations);
}