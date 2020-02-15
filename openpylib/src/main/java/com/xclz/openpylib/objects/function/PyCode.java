package com.xclz.openpylib.objects.function;

import com.xclz.openpylib.objects.basic.PyObject;
import com.xclz.openpylib.objects.sequence.PyBytes;
import com.xclz.openpylib.objects.sequence.PyTuple;
import com.xclz.openpylib.objects.sequence.PyUnicode;

public class PyCode extends PyObject {
    public static PyCode New(int argcount, int kwonlyargcount, int nlocals, int stacksize, int flags,
                             PyBytes code, PyTuple consts, PyTuple names, PyTuple varnames, PyTuple freevars, PyTuple cellvars,
                             PyUnicode filename, PyUnicode name, int firstlineno, PyBytes lnotab) {
        return _PyCode.New(argcount, kwonlyargcount, nlocals, stacksize, flags,
                code, consts, names, varnames, freevars, cellvars,
                filename, name, firstlineno, lnotab);
    }

    public static PyCode NewWithPosOnlyArgs(int argcount, int posonlyargcount, int kwonlyargcount, int nlocals,
                                            int stacksize, int flags, PyBytes code, PyTuple consts, PyTuple names, PyTuple varnames, PyTuple freevars,
                                            PyTuple cellvars, PyUnicode filename, PyUnicode name, int firstlineno, PyBytes lnotab) {
        return _PyCode.NewWithPosOnlyArgs(argcount, posonlyargcount, kwonlyargcount, nlocals, stacksize, flags,
                code, consts, names, varnames, freevars, cellvars,
                filename, name, firstlineno, lnotab);
    }

    public static PyCode NewEmpty(String filename, String funcname, int firstlineno) {
        return _PyCode.NewEmpty(filename, funcname, firstlineno);
    }

    public int getNumFree(PyCode obj) {
        return _PyCode.GetNumFree(obj);
    }
}

class _PyCode {
    //TODO int PyCode_Check(PyObject *co)
    public static native int GetNumFree(PyCode obj);

    public static native PyCode New(int argcount, int kwonlyargcount, int nlocals, int stacksize, int flags,
                                    PyBytes code, PyTuple consts, PyTuple names, PyTuple varnames, PyTuple freevars, PyTuple cellvars,
                                    PyUnicode filename, PyUnicode name, int firstlineno, PyBytes lnotab);

    public static native PyCode NewWithPosOnlyArgs(int argcount, int posonlyargcount, int kwonlyargcount, int nlocals,
                                                   int stacksize, int flags, PyBytes code, PyTuple consts, PyTuple names, PyTuple varnames, PyTuple freevars,
                                                   PyTuple cellvars, PyUnicode filename, PyUnicode name, int firstlineno, PyBytes lnotab); //TODO 3.8

    public static native PyCode NewEmpty(String filename, String funcname, int firstlineno);
}