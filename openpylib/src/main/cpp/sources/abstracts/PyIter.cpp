#include "globals.hpp"

extern "C" {
    
JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyIter_Check(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyIter_Check(obj))
        return nullptr;
    return NewPyIter(env, obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyIter_Next(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyIter_Next(obj);
    return NewPyObject(env, result);
}


}
