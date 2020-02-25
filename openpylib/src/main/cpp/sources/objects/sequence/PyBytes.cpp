#include "globals.hpp"

extern "C" {

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyBytes_Check(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyBytes_Check(obj))
        return nullptr;
    return NewPyBytes(env, obj);
}
    
JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyBytes_CheckExact(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyBytes_CheckExact(obj))
        return nullptr;
    return NewPyBytes(env, obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyBytes_FromString(JNIEnv *env, jclass, jstring jstr) {
    const char *str = env->GetStringUTFChars(jstr, NULL);
    PyObject *result = PyBytes_FromString(str);
    env->ReleaseStringUTFChars(jstr, str);
    return NewPyBytes(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyBytes_FromObject(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyBytes_FromObject(obj);
    return NewPyBytes(env, result);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_objects_sequence_PyBytes_Size(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyBytes_Size(obj);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_objects_sequence_PyBytes_SIZE(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyBytes_GET_SIZE(obj);
}

JNIEXPORT jstring JNICALL
Java_com_xclz_openpylib_objects_sequence_PyBytes_AsString(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    const char *str = PyBytes_AsString(obj);
    return env->NewStringUTF(str);;
}

JNIEXPORT jstring JNICALL
Java_com_xclz_openpylib_objects_sequence_PyBytes_AS_1STRING(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyBytes_AS_STRING();
}

JNIEXPORT void JNICALL
Java_com_xclz_openpylib_objects_sequence_PyBytes_Concat(JNIEnv *env, jclass, jobject jbytes, jobject jnewpart) {
    PyObject *bytes = obj_j2c(env, jbytes);
    PyObject *newpart = obj_j2c(env, jnewpart);
    PyBytes_Concat(&bytes, newpart);
    //TODO fix this
    env->SetLongField(jbytes, mPointer_field, (jlong)bytes);
}

//JNIEXPORT void JNICALL
//Java_com_xclz_openpylib_objects_sequence_PyBytes_ConcatAndDel(JNIEnv *env, jclass, jobject jbytes, jobject jnewpart) {
//    PyObject *bytes = obj_j2c(env, jbytes);
//    PyObject *newpart = obj_j2c(env, jnewpart);
//    PyBytes_ConcatAndDel(&bytes, newpart);
//    env->SetLongField(jbytes, mPointer_field, (jlong)bytes);
//}

}