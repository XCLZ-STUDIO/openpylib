package com.xclz.openpylib.abstracts;

import com.xclz.openpylib.objects.basic.PyObject;
import com.xclz.openpylib.objects.sequence.PyList;

public interface PyMapping {
    static PyMapping Check(PyObject obj) {
        return _PyMapping.Check(obj);
    }

    static long Size(PyObject obj) {
        return _PyMapping.Size(obj);
    }

    static long Length(PyMapping obj) {
        return _PyMapping.Length(obj);
    }

    static PyObject GetItem(PyMapping obj, String key) {
        return _PyMapping.GetItemString(obj, key);
    }

    static boolean SetItem(PyMapping obj, String key, PyObject value) {
        return _PyMapping.SetItemString(obj, key, value);
    }

    static boolean DelItem(PyMapping obj, PyObject key) {
        return _PyMapping.DelItem(obj, key);
    }

    static boolean DelItem(PyMapping obj, String key) {
        return _PyMapping.DelItemString(obj, key);
    }

    static boolean HasKey(PyMapping obj, PyObject key) {
        return _PyMapping.HasKey(obj, key);
    }

    static boolean HasKey(PyMapping obj, String key) {
        return _PyMapping.HasKeyString(obj, key);
    }

    static PyList Keys(PyMapping obj) {
        return _PyMapping.Keys(obj);
    }

    static PyList Values(PyMapping obj) {
        return _PyMapping.Values(obj);
    }

    static PyList Items(PyMapping obj) {
        return _PyMapping.Items(obj);
    }


    default long size(PyObject obj) {
        return Size(obj);
    }

    default long length() {
        return Length(this);
    }

    default PyObject getItem(String key) {
        return GetItem(this, key);
    }

    default boolean setItem(String key, PyObject value) {
        return SetItem(this, key, value);
    }

    default boolean delItem(PyObject key) {
        return DelItem(this, key);
    }

    default boolean delItem(String key) {
        return DelItem(this, key);
    }

    default boolean hasKey(PyObject key) {
        return HasKey(this, key);
    }

    default boolean hasKey(String key) {
        return HasKey(this, key);
    }

    default PyList keys() {
        return Keys(this);
    }

    default PyList values() {
        return Values(this);
    }

    default PyList items() {
        return Items(this);
    }
}

class _PyMapping {
    public static native PyMapping Check(PyObject obj);
    public static native long Size(PyObject obj);
    public static native long Length(PyMapping obj);
    public static native PyObject GetItemString(PyMapping obj, String key);
    public static native boolean SetItemString(PyMapping obj, String key, PyObject value);
    public static native boolean DelItem(PyMapping obj, PyObject key);
    public static native boolean DelItemString(PyMapping obj, String key);
    public static native boolean HasKey(PyMapping obj, PyObject key);
    public static native boolean HasKeyString(PyMapping obj, String key);
    public static native PyList Keys(PyMapping obj); //TODO 3.7是返回PyList  考虑兼容以前的版本
    public static native PyList Values(PyMapping obj);
    public static native PyList Items(PyMapping obj);
}