package com.xclz.openpylib.objects.other;

import com.xclz.openpylib.objects.basic.PyModuleDef;
import com.xclz.openpylib.objects.basic.PyObject;
import com.xclz.openpylib.objects.sequence.PyUnicode;

public class PyModule extends PyObject {
    public static PyModule New(String name) {
        return _PyModule.New(name);
    }

    public static PyModule New(PyObject name) {
        return _PyModule.NewObject(name);
    }

    public PyObject getDict() {
        return _PyModule.GetDict(this);
    }

    public PyObject getNameObject() {
        return _PyModule.GetNameObject(this);
    }

    public String getName() {
        return _PyModule.GetName(this);
    }

    public PyModuleDef getDef() {
        return _PyModule.GetDef(this);
    }

    public PyUnicode getFilenameObject() {
        return _PyModule.GetFilenameObject(this);
    }
}

class _PyModule {
    //TODO int PyModule_Check(PyObject *p)
    //TODO int PyModule_CheckExact(PyObject *p)
    public static native PyModule NewObject(PyObject name);

    public static native PyModule New(String name);

    public static native PyObject GetDict(PyModule obj);

    public static native PyObject GetNameObject(PyModule obj);

    public static native String GetName(PyModule obj);

    //TODO void* PyModule_GetState(PyObject *module)
    public static native PyModuleDef GetDef(PyModule obj);

    public static native PyUnicode GetFilenameObject(PyModule obj);
}