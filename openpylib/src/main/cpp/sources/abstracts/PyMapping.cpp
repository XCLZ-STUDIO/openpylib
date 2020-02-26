#include "globals.hpp"

extern "C" {

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyMapping_Check(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyMapping_Check(obj))
        return nullptr;
    return NewPyMapping(env, obj);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_abstracts__1PyMapping_Size(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyMapping_Size(obj);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_abstracts__1PyMapping_Length(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyMapping_Length(obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyMapping_GetItemString(JNIEnv *env, jclass, jobject jobj, jstring jkey) {
    PyObject *obj = obj_j2c(env, jobj);
    const char *key = env->GetStringUTFChars(jkey, NULL);
    PyObject *result = PyMapping_GetItemString(obj, key);
    env->ReleaseStringUTFChars(jkey, key);
    return NewPyObject(env, result);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_abstracts__1PyMapping_SetItemString(JNIEnv *env, jclass, jobject jobj, jstring jkey, jobject jvalue) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *value = obj_j2c(env, jvalue);
    const char *key = env->GetStringUTFChars(jkey, NULL);
    int result = PyMapping_SetItemString(obj, key, value);
    return bool_c2j(result);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_abstracts__1PyMapping_DelItem(JNIEnv *env, jclass, jobject jobj, jobject jkey) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *key = obj_j2c(env, jkey);
    int result = PyMapping_DelItem(obj, key);
    return bool_c2j(result);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_abstracts__1PyMapping_DelItemString(JNIEnv *env, jclass, jobject jobj, jstring jkey) {
    PyObject *obj = obj_j2c(env, jobj);
    const char *key = env->GetStringUTFChars(jkey, NULL);
    int result = PyMapping_DelItemString(obj, key);
    env->ReleaseStringUTFChars(jkey, key);
    return bool_c2j(result);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_abstracts__1PyMapping_HasKey(JNIEnv *env, jclass, jobject jobj, jobject jkey) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *key = obj_j2c(env, jkey);
    int result = PyMapping_HasKey(obj, key);
    return bool_c2j(result);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_abstracts__1PyMapping_HasKeyString(JNIEnv *env, jclass, jobject jobj, jstring jkey) {
    PyObject *obj = obj_j2c(env, jobj);
    const char *key = env->GetStringUTFChars(jkey, NULL);
    int result = PyMapping_HasKeyString(obj, key);
    return bool_c2j(result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyMapping_Keys(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyMapping_Keys(obj);
    return NewPyList(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyMapping_Values(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyMapping_Values(obj);
    return NewPyList(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyMapping_Items(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyMapping_Items(obj);
    return NewPyList(env, result);
}


}