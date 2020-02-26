#include "globals.hpp"

extern "C" {
    
JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyCallable_Check(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyCallable_Check(obj))
        return nullptr;
    return NewPyCallable(env, obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyCallable_Call(JNIEnv *env, jclass, jobject jcallable, jobject jargs, jobject jkwargs) {
    PyObject *callable = obj_j2c(env, jcallable);
    PyObject *args = obj_j2c(env, jargs);
    PyObject *kwargs = obj_j2c(env, jkwargs);
    PyObject *result = PyObject_Call(callable, args, kwargs);
    return NewPyObject(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyCallable_CallObject(JNIEnv *env, jclass, jobject jcallable, jobject jargs) {
    PyObject *callable = obj_j2c(env, jcallable);
    PyObject *args = obj_j2c(env, jargs);
    PyObject *result = PyObject_CallObject(callable, args);
    return NewPyObject(env, result);
}

}
