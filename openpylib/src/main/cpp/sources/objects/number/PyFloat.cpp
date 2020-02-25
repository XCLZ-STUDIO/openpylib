#include "globals.hpp"

extern "C" {

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_number_PyFloat_Check(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyFloat_Check(obj))
        return nullptr;
    return NewPyFloat(env, obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_number_PyFloat_CheckExact(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (PyFloat_CheckExact(obj))
        return nullptr;
    return NewPyFloat(env, obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_number_PyFloat_FromString(JNIEnv *env, jclass, jobject jstr) {
    PyObject *str = obj_j2c(env, jstr);
    PyObject *result = PyFloat_FromString(str);
    return NewPyFloat(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_number_PyFloat_FromDouble(JNIEnv *env, jclass, jdouble v) {
    PyObject *result = PyFloat_FromDouble(v);
    return NewPyFloat(env, result);
}

JNIEXPORT jdouble JNICALL
Java_com_xclz_openpylib_objects_number_PyFloat_AsDouble(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyFloat_AsDouble(obj);
}

JNIEXPORT jdouble JNICALL
Java_com_xclz_openpylib_objects_number_PyFloat_AS_1DOUBLE(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyFloat_AS_DOUBLE(obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_number_PyFloat_GetInfo(JNIEnv *env, jclass) {
    PyObject *result = PyFloat_GetInfo();
    return NewPyFloat(env, result);
}

JNIEXPORT jdouble JNICALL
Java_com_xclz_openpylib_objects_number_PyFloat_GetMax(JNIEnv*, jclass) {
    return PyFloat_GetMax();
}

JNIEXPORT jdouble JNICALL
Java_com_xclz_openpylib_objects_number_PyFloat_GetMin(JNIEnv*, jclass) {
    return PyFloat_GetMin();
}

JNIEXPORT jint JNICALL
Java_com_xclz_openpylib_objects_number_PyFloat_ClearFreeList(JNIEnv*, jclass) {
    return PyFloat_ClearFreeList();
}

}