#include "globals.hpp"

extern "C" {

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyList_Check(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyList_Check(obj))
        return nullptr;
    return NewPyList(env, obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyList_CheckExact(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyList_CheckExact(obj))
        return nullptr;
    return NewPyList(env, obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyList_New(JNIEnv *env, jclass, jlong len) {
    PyObject *result = PyList_New(len);
    return NewPyList(env, result);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_objects_sequence_PyList_Size(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyList_Size(obj);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_objects_sequence_PyList_SIZE(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyList_GET_SIZE(obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyList_GetItem(JNIEnv *env, jclass, jobject jobj, jlong i) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyList_GetItem(obj ,i);
    Py_INCREF(result);
    return NewPyObject(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyList_GET_1ITEM(JNIEnv *env, jclass, jobject jobj, jlong i) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyList_GET_ITEM(obj ,i);
    Py_INCREF(result);
    return NewPyObject(env, result);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_sequence_PyList_SetItem(JNIEnv *env, jclass, jobject jobj, jlong i, jobject jitem) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *item = obj_j2c(env, jitem);
    int result = PyList_SetItem(obj, i, item);
    Py_INCREF(item);
    return (jboolean)result;
}

JNIEXPORT void JNICALL
Java_com_xclz_openpylib_objects_sequence_PyList_SET_1ITEM(JNIEnv *env, jclass, jobject jobj, jlong i, jobject jitem) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *item = obj_j2c(env, jitem);
    PyList_SET_ITEM(obj, i, item);
    Py_INCREF(item);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_sequence_PyList_Insert(JNIEnv *env, jclass, jobject jobj, jlong i, jobject jitem) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *item = obj_j2c(env, jitem);
    int result = PyList_Insert(obj, i, item);
    return (jboolean)result;
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_sequence_PyList_Append(JNIEnv *env, jclass, jobject jobj, jobject jitem) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *item = obj_j2c(env, jitem);
    int result = PyList_Append(obj, item);
    return (jboolean)result;
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyList_GetSlice(JNIEnv *env, jclass, jobject jobj, jlong low, jlong high) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyList_GetSlice(obj, low, high);
    return NewPyList(env, result);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_sequence_PyList_SetSlice(JNIEnv *env, jclass, jobject jobj, jlong low, jlong high, jobject jitemlist) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *itemlist = obj_j2c(env, jitemlist);
    int result = PyList_SetSlice(obj, low, high, itemlist);
    return (jboolean)result;
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_sequence_PyList_Sort(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    int result = PyList_Sort(obj);
    return (jboolean)result;
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_sequence_PyList_Reverse(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    int result = PyList_Reverse(obj);
    return (jboolean)result;
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyList_AsTuple(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyList_AsTuple(obj);
    return NewPyTuple(env, result);
}

JNIEXPORT jint JNICALL
Java_com_xclz_openpylib_objects_sequence_PyList_ClearFreeList(JNIEnv*, jclass) {
    return PyList_ClearFreeList();
}

}