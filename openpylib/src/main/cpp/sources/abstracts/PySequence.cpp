#include "globals.hpp"

extern "C" {

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PySequence_Check(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PySequence_Check(obj))
        return nullptr;
    return NewPySequence(env, obj);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_abstracts__1PySequence_Size(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PySequence_Size(obj);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_abstracts__1PySequence_Length(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PySequence_Length(obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PySequence_Concat(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PySequence_Concat(o1, o2);
    return NewPySequence(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PySequence_Repeat(JNIEnv *env, jclass, jobject jobj, jlong countPySequence) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PySequence_Repeat(obj, countPySequence);
    return NewPySequence(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PySequence_InPlaceConcat(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PySequence_InPlaceConcat(o1, o2);
    return NewPySequence(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PySequence_InPlaceRepeat(JNIEnv *env, jclass, jobject jobj, jlong countPySequence) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PySequence_InPlaceRepeat(obj, countPySequence);
    return NewPySequence(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PySequence_GetItem(JNIEnv *env, jclass, jobject jobj, jlong index) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PySequence_GetItem(obj, index);
    return NewPyObject(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PySequence_GetSlice(JNIEnv *env, jclass, jobject jobj, jlong index1, jlong index2) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PySequence_GetSlice(obj, index1, index2);
    return NewPySequence(env, result);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_abstracts__1PySequence_SetItem(JNIEnv *env, jclass, jobject jobj, jlong index, jobject jvalue) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *value = obj_j2c(env, jvalue);
    int result = PySequence_SetItem(obj, index, value);
    return (jboolean)result;
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_abstracts__1PySequence_DelItem(JNIEnv *env, jclass, jobject jobj, jlong index) {
    PyObject *obj = obj_j2c(env, jobj);
    int result = PySequence_DelItem(obj, index);
    return (jboolean)result;
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_abstracts__1PySequence_SetSlice(JNIEnv *env, jclass, jobject jobj, jlong index1, jlong index2, jobject jvalue) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *value = obj_j2c(env, jvalue);
    int result = PySequence_SetSlice(obj, index1, index2, value);
    return (jboolean)result;
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_abstracts__1PySequence_Count(JNIEnv *env, jclass, jobject jobj, jobject jvalue) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *value = obj_j2c(env, jvalue);
    return PySequence_Count(obj, value);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_abstracts__1PySequence_Contains(JNIEnv *env, jclass, jobject jobj, jobject jvalue) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *value = obj_j2c(env, jvalue);
    int result = PySequence_Contains(obj, value);
    return (jboolean)result;
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_abstracts__1PySequence_Index(JNIEnv *env, jclass, jobject jobj, jobject jvalue) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *value = obj_j2c(env, jvalue);
    return PySequence_Index(obj, value);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PySequence_List(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PySequence_List(obj);
    return NewPyList(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PySequence_Tuple(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PySequence_Tuple(obj);
    return NewPyTuple(env, result);
}


}