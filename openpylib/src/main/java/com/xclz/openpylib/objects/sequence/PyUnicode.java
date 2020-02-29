package com.xclz.openpylib.objects.sequence;

import com.xclz.openpylib.abstracts.PyMapping;
import com.xclz.openpylib.abstracts.PySequence;
import com.xclz.openpylib.objects.basic.PyObject;

public class PyUnicode extends PyObject implements PySequence, PyMapping {
    public static native int ClearFreeList();
    public static native PyUnicode Check(PyObject obj);
    public static native PyUnicode CheckExact(PyObject obj);
    public static native PyUnicode AsString(PyUnicode obj);
    public static native PyUnicode FromString(String str);
    public static native long Length(PyUnicode obj);
    public static native PyUnicode Concat(PyUnicode left, PyUnicode right);
    public static native PyList Split(PyUnicode obj, PyUnicode sep, long max_split);
    public static native PyList SplitLines(PyUnicode obj, boolean keep_end);
    public static native PyUnicode Translate(PyUnicode obj, PyMapping table, String error);
    public static native PyUnicode Join(PyUnicode obj, PySequence seq);
    public static native long TailMatch(PyUnicode obj, PyUnicode sub, long start, long end, int direction);
    public static native long Find(PyUnicode obj, PyUnicode sub, long start, long end, int direction);
    public static native long Count(PyUnicode obj, PyUnicode sub, long start, long end);
    public static native PyUnicode Replace(PyUnicode obj, PyUnicode sub, PyUnicode rep, long max_count);
    public static native int Compare(PyUnicode left, PyUnicode right);
    public static native int CompareWithASCII(PyUnicode obj, String str);
    public static native PyObject RichCompare(PyUnicode left, PyUnicode right, int op);
    public static native PyObject Format(PyUnicode format, PyObject args);
    public static native boolean Contains(PyUnicode obj, PyUnicode sub);
    //void PyUnicode_InternInPlace(PyObject **string)
    //PyObject* PyUnicode_InternFromString(const char *v)
    
    public PyUnicode asString(PyUnicode obj) {
        return AsString(obj);
    }
    
    public PyUnicode fromString(String str) {
        return FromString(str);
    }
    
    public long length(PyUnicode obj) {
        return Length(obj);
    }
    
    public PyUnicode concat(PyUnicode left, PyUnicode right) {
        return Concat(left, right);
    }
    
    public PyList split(PyUnicode obj, PyUnicode sep, long max_split) {
        return Split(obj, sep, max_split);
    }
    
    public PyList splitLines(PyUnicode obj, boolean keep_end) {
        return SplitLines(obj, keep_end);
    }
    
    public PyUnicode translate(PyUnicode obj, PyMapping table, String error) {
        return Translate(obj, table, error);
    }
    
    public PyUnicode join(PyUnicode obj, PySequence seq) {
        return Join(obj, seq);
    }
    
    public long tailMatch(PyUnicode obj, PyUnicode sub, long start, long end, int direction) {
        return TailMatch(obj, sub, start, end, direction);
    }
    
    public long find(PyUnicode obj, PyUnicode sub, long start, long end, int direction) {
        return Find(obj, sub, start, end, direction);
    }
    
    public long count(PyUnicode obj, PyUnicode sub, long start, long end) {
        return Count(obj, sub, start, end);
    }
    
    public PyUnicode replace(PyUnicode obj, PyUnicode sub, PyUnicode rep, long max_count) {
        return Replace(obj, sub, rep, max_count);
    }
    
    public int compare(PyUnicode left, PyUnicode right) {
        return Compare(left, right);
    }
    
    public int compareWithASCII(PyUnicode obj, String str) {
        return CompareWithASCII(obj, str);
    }
    
    public PyObject richCompare(PyUnicode left, PyUnicode right, int op) {
        return RichCompare(left, right, op);
    }
    
    public PyObject format(PyUnicode format, PyObject args) {
        return Format(format, args);
    }
    
    public boolean contains(PyUnicode obj, PyUnicode sub) {
        return Contains(obj, sub);
    }
}
