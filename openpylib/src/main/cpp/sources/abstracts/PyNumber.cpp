#include "globals.hpp"

extern "C" {

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_Check(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyNumber_Check(obj))
        return nullptr;
    return NewPyNumber(env, obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_Add(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_Add(o1, o2);
    return NewPyNumber(env, result);
}

}