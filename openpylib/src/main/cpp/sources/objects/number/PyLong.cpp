#include "globals.hpp"

extern "C" {


JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_number_PyLong_Check(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyLong_Check(obj))
        return nullptr;
    return NewPyLong(env, obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_number_PyLong_CheckExact(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyLong_CheckExact(obj))
        return nullptr;
    return NewPyLong(env, obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_number_PyLong_FromLong(JNIEnv *env, jclass, jlong v) {
    PyObject *result = PyLong_FromLong(v);
    return NewPyLong(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_number_PyLong_FromDouble(JNIEnv *env, jclass, jdouble v) {
    PyObject *result = PyLong_FromDouble(v);
    return NewPyLong(env, result);
}

//JNIEXPORT jobject JNICALL
//Java_com_xclz_openpylib_objects_number_PyLong_FromString(JNIEnv *env, jclass, jstring jstr, jint base) {
//    const char *str = env->GetStringUTFChars(jstr, NULL);
//    PyObject *result = PyLong_FromString(str, base);
//    env->ReleaseStringUTFChars(jstr, str);
//    return NewPyLong(env, result);
//}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_number_PyLong_FromUnicodeObject(JNIEnv *env, jclass, jobject junicode, jint base) {
    PyObject *unicode = obj_j2c(env, junicode);
    PyObject *result = PyLong_FromUnicodeObject(unicode, base);
    return NewPyLong(env, result);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_objects_number_PyLong_AsLong(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyLong_AsLong(obj);
}

JNIEXPORT jdouble JNICALL
Java_com_xclz_openpylib_objects_number_PyLong_AsDouble(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyLong_AsDouble(obj);
}

}