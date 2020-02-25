#include "globals.hpp"

extern "C" {

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyByteArray_Check(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyByteArray_Check(obj))
        return nullptr;
    return NewPyByteArray(env, obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyByteArray_CheckExact(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyByteArray_CheckExact(obj))
        return nullptr;
    return NewPyByteArray(env, obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyByteArray_FromObject(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyByteArray_FromObject(obj);
    return NewPyByteArray(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyByteArray_FromString(JNIEnv *env, jclass, jstring jstr) {
    const char *str = env->GetStringUTFChars(jstr, nullptr);
    jsize size = env->GetStringLength(jstr);
    PyObject *result = PyByteArray_FromStringAndSize(str, size);
    return NewPyByteArray(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyByteArray_Concat(JNIEnv *env, jclass, jobject ja, jobject jb) {
    PyObject *a = obj_j2c(env, ja);
    PyObject *b = obj_j2c(env, jb);
    PyObject *result = PyByteArray_Concat(a, b);
    return NewPyByteArray(env, result);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_objects_sequence_PyByteArray_Size(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyByteArray_Size(obj);
}

JNIEXPORT jstring JNICALL
Java_com_xclz_openpylib_objects_sequence_PyByteArray_AsString(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    const char *result = PyByteArray_AsString(obj);
    return env->NewStringUTF(result);
}

JNIEXPORT jint JNICALL
Java_com_xclz_openpylib_objects_sequence_PyByteArray_Resize(JNIEnv *env, jclass, jobject jobj, jlong len) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyByteArray_Resize(obj, len);
}
    
}