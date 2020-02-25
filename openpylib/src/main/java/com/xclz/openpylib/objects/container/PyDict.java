package com.xclz.openpylib.objects.container;

import com.xclz.openpylib.abstracts.PyMapping;
import com.xclz.openpylib.objects.basic.PyObject;
import com.xclz.openpylib.objects.sequence.PyList;

public class PyDict extends PyObject implements PyMapping {
    public static native PyDict Check(PyObject obj);
    public static native PyDict CheckExact(PyObject obj);
    public static native PyDict New();
    //TODO PyObject* PyDictProxy_New(PyObject *mapping)
    public static native void Clear(PyDict obj);
    public static native boolean Contains(PyDict obj, PyObject key);
    public static native PyDict Copy(PyDict obj);
    public static native boolean SetItem(PyDict obj, PyObject key, PyObject value);
    public static native boolean SetItemString(PyDict obj, String key, PyObject value);
    public static native boolean DelItem(PglyDict obj, PyObject key);
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


    public void clear() {
        Clear(this);
    }

    public boolean contains(PyObject key) {
        return Contains(this, key);
    }

    public PyDict copy() {
        return Copy(this);
    }

    public boolean setItem(PyObject key, PyObject value) {
        return SetItem(this, key, value);
    }

    public boolean setItem(String key, PyObject value) {
        return SetItemString(this, key, value);
    }

    public boolean delItem(PyObject key) {
        return DelItem(this, key);
    }

    public boolean delItem(String key) {
        return DelItemString(this, key);
    }

    public PyObject getItem(PyObject key) {
        return GetItem(this, key);
    }

    public PyObject getItem(String key) {
        return GetItemString(this, key);
    }

    public PyObject getItemWithError(PyObject key) {
        return GetItemWithError(this, key);
    }

    public PyObject setDefault(PyObject key, PyObject defaultobj) {
        return SetDefault(this, key, defaultobj);
    }

    public PyList items() {
        return Items(this);
    }

    public PyList keys() {
        return Keys(this);
    }

    public PyList values() {
        return Values(this);
    }

    public long size() {
        return Size(this);
    }

    public boolean merge(PyMapping b, boolean override) {
        return Merge(this, b, override);
    }

    public boolean update(PyMapping b) {
        return Update(this, b);
    }
}