package com.xclz.openpylib.objects.basic;

import com.xclz.openpylib.abstracts.PyBase;
import com.xclz.openpylib.objects.sequence.PyBytes;
import com.xclz.openpylib.objects.sequence.PyList;
import com.xclz.openpylib.objects.sequence.PyTuple;
import com.xclz.openpylib.objects.sequence.PyUnicode;
import com.xclz.openpylib.python.Py;

public class PyObject implements AutoCloseable, PyBase {
    long mPointer = 0;
    long ob_refcnt = 1;
    PyType ob_type;

    @Override
    public void close() {
        Py._Decref(this);
    }

    // public PyObject(PyType type) {
    //     ob_type = type;
    // }

    public static native boolean HasAttr(PyObject obj, PyObject name);
    public static native boolean HasAttrString(PyObject obj, String name);
    public static native PyObject GetAttr(PyObject obj, PyObject name);
    public static native PyObject GetAttrString(PyObject obj, String name);
    public static native boolean DelAttr(PyObject obj, PyObject name);
    public static native boolean DelAttrString(PyObject obj, String name);
    public static native PyObject RichCompare(PyObject obj1, PyObject obj2, int opid);
    public static native boolean RichCompareBool(PyObject obj1, PyObject obj2, int opid);
    public static native boolean IsInstance(PyObject inst, PyObject cls);
    public static native PyUnicode Repr(PyObject obj);
    public static native PyUnicode ASCII(PyObject obj);
    public static native PyUnicode Str(PyObject obj);
    public static native PyBytes Bytes(PyObject obj);
    public static native long Hash(PyObject obj);
    public static native boolean IsTrue(PyObject obj);
    public static native int Not(PyObject obj);
    public static native PyType Type(PyObject obj);
    public static native long Size(PyObject obj);
    public static native long Length(PyObject obj);
    public static native long LengthHint(PyObject obj, long publicValue);
    public static native PyObject GetItem(PyObject obj, PyObject key);
    public static native boolean SetItem(PyObject obj, PyObject key, PyObject value);
    public static native boolean DelItem(PyObject obj, PyObject key);
    public static native PyList Dir(PyObject obj);
    public static native PyObject GetIter(PyObject obj);
    public static native PyObject CallMethod(PyObject obj, String name, PyTuple args);

    public static boolean HasAttr(PyObject obj, String name) {
        return HasAttrString(obj, name);
    }

    public static PyObject GetAttr(PyObject obj, String name) {
        return GetAttrString(obj, name);
    }

    public static boolean DelAttr(PyObject obj, String name) {
        return DelAttrString(obj, name);
    }

    public static PyObject CallMethod(PyObject obj, String name, PyObject... args) {
        return CallMethod(obj, name, PyTuple.Pack(args));
    }

    //TODO int PyObject_Print(PyObject *o, FILE *fp, int flags)

    public boolean hasAttr(PyObject name) {
        return PyObject.HasAttr(this, name);
    }

    public boolean hasAttr(String name) {
        return PyObject.HasAttrString(this, name);
    }

    public PyObject getAttr(PyObject name) {
        return PyObject.GetAttr(this, name);
    }

    public PyObject getAttr(String name) {
        return PyObject.GetAttrString(this, name);
    }

    public boolean delAttr(PyObject name) {
        return PyObject.DelAttr(this, name);
    }

    public boolean delAttr(String name) {
        return PyObject.DelAttrString(this, name);
    }

    public PyObject richCompare(PyObject other, int opid) {
        return PyObject.RichCompare(this, other, opid);
    }

    public boolean richCompareBool(PyObject other, int opid) {
        return PyObject.RichCompareBool(this, other, opid);
    }

//TODO implement this in PyType
//    public boolean isSubClass(PyObject clazz) {
//        return PyObject.IsSubClass(this, clazz);
//    }

    public boolean isInstance(PyObject clazz) {
        return PyObject.IsInstance(this, clazz);
    }

    public PyUnicode repr() {
        return PyObject.Repr(this);
    }

    public PyUnicode ascii() {
        return PyObject.ASCII(this);
    }

    public PyUnicode str() {
        return PyObject.Str(this);
    }

    public PyBytes bytes() {
        return PyObject.Bytes(this);
    }

    public long hash() {
        return PyObject.Hash(this);
    }

    public boolean isTrue() {
        return PyObject.IsTrue(this);
    }

    public int not() {
        return PyObject.Not(this);
    }

    public PyType type() {
        return PyObject.Type(this);
    }

    //TODO int PyObject_TypeCheck(PyObject *o, PyTypeObject *type)

    public long size() {
        return PyObject.Size(this);
    }

    public long length() {
        return PyObject.Length(this);
    }

    public long length(long publicValue) {
        return PyObject.LengthHint(this, publicValue);
    }

    //TODO add an long overload
    public PyObject getItem(PyObject key) {
        return PyObject.GetItem(this, key);
    }

    //TODO add an long overload
    public boolean setItem(PyObject key, PyObject value) {
        return PyObject.SetItem(this, key, value);
    }

    public boolean delItem(PyObject key) {
        return PyObject.DelItem(this, key);
    }

    public PyList dir() {
        return PyObject.Dir(this);
    }

    public PyObject getIter() {
        return PyObject.GetIter(this);
    }
}