package com.xclz.openpylib.objects.basic;

import com.xclz.openpylib.abstracts.PyCallable;
import com.xclz.openpylib.structures.PyAsyncMethods;
import com.xclz.openpylib.structures.PyType_Spec;

public class PyType extends PyVarObject implements PyCallable {
    String tp_name;
    long tp_basicsize, tp_itemsize;
    long tp_alloc; //void (*destructor)(PyObject *);
    long tp_vectorcall_offset;
    long tp_getattr; //PyObject *(*getattrfunc)(PyObject *, char *);
    long tp_setattr; //int (*setattrfunc)(PyObject *, char *, PyObject *);
    PyAsyncMethods tp_as_async;
    long tp_repr; //PyObject *(*reprfunc)(PyObject *);

    // public PyType() {
    //     super(null, 0);
    // }

    public static int ClearCache() {
        return _PyType.ClearCache();
    }

    public static PyObject FromSpecWithBases(PyType_Spec spec, PyObject bases) {
        return _PyType.FromSpecWithBases(spec, bases);
    }

    public static PyObject FromSpec(PyType_Spec spec) {
        return _PyType.FromSpec(spec);
    }

    public long getFlags() {
        return _PyType.GetFlags(this);
    }

    public void modified() {
        _PyType.Modified(this);
    }

    public boolean hasFeature() {
        return _PyType.HasFeature(this);
    }

    public boolean isGC() {
        return _PyType.IS_GC(this);
    }

    public boolean isSubtype(PyType other) {
        return _PyType.IsSubtype(this, other);
    }

    public boolean ready() {
        return _PyType.Ready(this);
    }
}

class _PyType {
    public static native int ClearCache();

    public static native int GetFlags(PyType type);

    public static native void Modified(PyType type);

    public static native boolean HasFeature(PyType type);

    public static native boolean IS_GC(PyType type);

    public static native boolean IsSubtype(PyType a, PyType b);

    //TODO PyObject* PyType_GenericAlloc(PyTypeObject *type, Py_ssize_t nitems)
    //TODO PyObject* PyType_GenericNew(PyTypeObject *type, PyObject *args, PyObject *kwds)
    public static native boolean Ready(PyType type);

    //TODO void* PyType_GetSlot(PyTypeObject *type, int slot)
    public static native PyObject FromSpecWithBases(PyType_Spec spec, PyObject bases);

    public static native PyObject FromSpec(PyType_Spec spec);
}