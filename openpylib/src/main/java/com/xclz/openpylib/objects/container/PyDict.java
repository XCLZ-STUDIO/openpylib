package com.xclz.openpylib.objects.container;

import com.xclz.openpylib.abstracts.PyMapping;
import com.xclz.openpylib.objects.basic.PyObject;
import com.xclz.openpylib.objects.sequence.PyList;

public class PyDict extends PyObject implements PyMapping {
    public static PyDict New() {
        return _PyDict.New();
    }

    public static int ClearFreeList() {
        return _PyDict.ClearFreeList();
    }

    public void clear() {
        _PyDict.Clear(this);
    }

    public boolean contains(PyObject key) {
        return _PyDict.Contains(this, key);
    }

    public PyDict copy() {
        return _PyDict.Copy(this);
    }

    public boolean setItem(PyObject key, PyObject value) {
        return _PyDict.SetItem(this, key, value);
    }

    public boolean setItem(String key, PyObject value) {
        return _PyDict.SetItemString(this, key, value);
    }

    public boolean delItem(PyObject key) {
        return _PyDict.DelItem(this, key);
    }

    public boolean delItem(String key) {
        return _PyDict.DelItemString(this, key);
    }

    public PyObject getItem(PyObject key) {
        return _PyDict.GetItem(this, key);
    }

    public PyObject getItem(String key) {
        return _PyDict.GetItemString(this, key);
    }

    public PyObject getItemWithError(PyObject key) {
        return _PyDict.GetItemWithError(this, key);
    }

    public PyObject setDefault(PyObject key, PyObject defaultobj) {
        return _PyDict.SetDefault(this, key, defaultobj);
    }

    public PyList items() {
        return _PyDict.Items(this);
    }

    public PyList keys() {
        return _PyDict.Keys(this);
    }

    public PyList values() {
        return _PyDict.Values(this);
    }

    public long size() {
        return _PyDict.Size(this);
    }

    public boolean merge(PyMapping b, boolean override) {
        return _PyDict.Merge(this, b, override);
    }

    public boolean update(PyMapping b) {
        return _PyDict.Update(this, b);
    }

}

class _PyDict {
    //TODO int PyDict_Check(PyObject *p)
    //TODO int PyDict_CheckExact(PyObject *p)
    public static native PyDict New();

    //TODO PyObject* PyDictProxy_New(PyObject *mapping)
    public static native void Clear(PyDict obj);

    public static native boolean Contains(PyDict obj, PyObject key);

    public static native PyDict Copy(PyDict obj);

    public static native boolean SetItem(PyDict obj, PyObject key, PyObject value);

    public static native boolean SetItemString(PyDict obj, String key, PyObject value);

    public static native boolean DelItem(PyDict obj, PyObject key);

    public static native boolean DelItemString(PyDict obj, String key);

    public static native PyObject GetItem(PyDict obj, PyObject key);    //TODO incref

    public static native PyObject GetItemWithError(PyDict obj, PyObject key);   //TODO incref

    public static native PyObject GetItemString(PyDict obj, String key);    //TODO incref

    public static native PyObject SetDefault(PyDict obj, PyObject key, PyObject defaultobj);    //TODO incref

    public static native PyList Items(PyDict obj);

    public static native PyList Keys(PyDict obj);

    public static native PyList Values(PyDict obj);

    public static native long Size(PyDict obj);

    //TODO int PyDict_Next(PyObject *p, Py_ssize_t *ppos, PyObject **pkey, PyObject **pvalue)
    public static native boolean Merge(PyDict a, PyMapping b, boolean override);

    public static native boolean Update(PyDict a, PyMapping b);

    //TODO int PyDict_MergeFromSeq2(PyObject *a, PyObject *seq2, int override)
    public static native int ClearFreeList();
}