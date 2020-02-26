#include "globals.hpp"

extern "C" {
    
JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyTuple_Check(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyTuple_Check(obj))
        return nullptr;
    return NewPyTuple(env, obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyTuple_CheckExact(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyTuple_CheckExact(obj))
        return nullptr;
    return NewPyTuple(env, obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyTuple_New(JNIEnv *env, jclass, jlong len) {
    PyObject *result = PyTuple_New(len);
    return NewPyTuple(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyTuple_Pack(JNIEnv *env, jclass, jobjectArray items) {
    jsize length = env->GetArrayLength(items);
    PyObject *result = PyTuple_New(length);
    if (result == nullptr)
        return nullptr;
    for (jsize i = 0; i < length; i++) {
        jobject jitem = env->GetObjectArrayElement(items, i);
        PyObject *item = obj_j2c(env, jitem);
        Py_INCREF(item);
        PyTuple_SET_ITEM(result, i, item);
    }
    return NewPyTuple(env, result);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_objects_sequence_PyTuple_Size(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyTuple_Size(obj);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_objects_sequence_PyTuple_SIZE(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyTuple_GET_SIZE(obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyTuple_GetItem(JNIEnv *env, jclass, jobject jobj, jlong pos) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyTuple_GetItem(obj, pos);
    return NewPyObject(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyTuple_GET_1ITEM(JNIEnv *env, jclass, jobject jobj, jlong pos) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyTuple_GET_ITEM(obj, pos);
    return NewPyObject(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyTuple_GetSlice(JNIEnv *env, jclass, jobject jobj, jlong low, jlong high) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyTuple_GetSlice(obj, low, high);
    return NewPyTuple(env, result);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_sequence_PyTuple_SetItem(JNIEnv *env, jclass, jobject jobj, jlong pos, jobject jvalue) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *value = obj_j2c(env, jvalue);
    int result = PyTuple_SetItem(obj, pos, value);
    return bool_c2j(result);
}

JNIEXPORT void JNICALL
Java_com_xclz_openpylib_objects_sequence_PyTuple_SET_1ITEM(JNIEnv *env, jclass, jobject jobj, jlong pos, jobject jvalue) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *value = obj_j2c(env, jvalue);
    PyTuple_SET_ITEM(obj, pos, value);
}

JNIEXPORT jint JNICALL
Java_com_xclz_openpylib_objects_sequence_PyTuple_ClearFreeList(JNIEnv*, jclass) {
    return PyTuple_ClearFreeList();
}


}