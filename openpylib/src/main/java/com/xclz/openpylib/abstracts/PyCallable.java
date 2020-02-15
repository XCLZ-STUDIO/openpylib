package com.xclz.openpylib.abstracts;

import com.xclz.openpylib.objects.basic.PyObject;

public interface PyCallable extends PyBase {
    //TODO 仔细思考check函数的何去何从
    static PyCallable Check(PyObject obj) {
        return _PyCallable.Check(obj);
    }

    //TODO call* methods (CallMethod 不能抽出来，还要放回PyObject)
}

class _PyCallable {
    public static native PyCallable Check(PyObject obj);
//    public static native PyObject Call(PyObject callable, PyObject args, PyObject kwargs);
//    public static native PyObject CallObject(PyObject callable, PyObject args);
//    public static native PyObject CallMethod(PyObject callable, PyObject args);
//    public static native PyObject CallFunctionObjArgs(PyObject callable, PyObject[] args);
//    public static native PyObject CallMethodObjArgs(PyObject callable, PyObject[] args);
}