#include "globals.hpp"

extern "C" {

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_Check(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyDict_Check(obj))
        return nullptr;
    return NewPyDict(env, obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_CheckExact(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyDict_CheckExact(obj))
        return nullptr;
    return NewPyDict(env, obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_New(JNIEnv *env, jclass) {
    PyObject *result = PyDict_New();
    return NewPyDict(env, result);
}

JNIEXPORT void JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_Clear(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyDict_Clear(obj);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_Contains(JNIEnv *env, jclass, jobject jobj, jobject jkey) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *key = obj_j2c(env, jkey);
    int result = PyDict_Contains(obj, key);
    return (jboolean) result;
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_Copy(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyDict_Copy(obj);
    return NewPyDict(env, result);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_SetItem(JNIEnv *env, jclass, jobject jobj, jobject jkey, jobject jvalue) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *key = obj_j2c(env, jkey);
    PyObject *value = obj_j2c(env, jvalue);
    int result = PyDict_SetItem(obj, key, value);
    return (jboolean) result;
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_SetItemString(JNIEnv *env, jclass, jobject jobj, jstring jkey, jobject jvalue) {
    PyObject *obj = obj_j2c(env, jobj);
    const char *key = env->GetStringUTFChars(jkey, nullptr);
    PyObject *value = obj_j2c(env, jvalue);
    int result = PyDict_SetItemString(obj, key, value);
    return (jboolean) result;
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_DelItem(JNIEnv *env, jclass, jobject jobj, jobject jkey) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *key = obj_j2c(env, jkey);
    int result = PyDict_DelItem(obj, key);
    return (jboolean) result;
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_DelItemString(JNIEnv *env, jclass, jobject jobj, jstring jkey) {
    PyObject *obj = obj_j2c(env, jobj);
    const char *key = env->GetStringUTFChars(jkey, nullptr);
    int result = PyDict_DelItemString(obj, key);
    return (jboolean) result;
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_GetItem(JNIEnv *env, jclass, jobject jobj, jobject jkey) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *key = obj_j2c(env, jkey);
    PyObject *result = PyDict_GetItem(obj, key);
    Py_INCREF(result);
    return NewPyObject(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_GetItemWithError(JNIEnv *env, jclass, jobject jobj, jobject jkey) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *key = obj_j2c(env, jkey);
    PyObject *result = PyDict_GetItemWithError(obj, key);
    Py_INCREF(result);
    return NewPyObject(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_GetItemString(JNIEnv *env, jclass, jobject jobj, jstring jkey) {
    PyObject *obj = obj_j2c(env, jobj);
    const char *key = env->GetStringUTFChars(jkey, nullptr);
    PyObject *result = PyDict_GetItemString(obj, key);
    Py_INCREF(result);
    return NewPyObject(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_SetDefault(JNIEnv *env, jclass, jobject jobj, jobject jkey, jobject jdefaultobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *key = obj_j2c(env, jkey);
    PyObject *defaultobj = obj_j2c(env, jdefaultobj);
    PyObject *result = PyDict_SetDefault(obj, key, defaultobj);
    Py_INCREF(result);
    return NewPyObject(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_Items(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyDict_Items(obj);
    return NewPyList(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_Keys(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyDict_Keys(obj);
    return NewPyList(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_Values(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyDict_Values(obj);
    return NewPyList(env, result);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_Size(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyDict_Size(obj);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_Merge(JNIEnv *env, jclass, jobject ja,
                                                       jobject jb, jboolean override) {
    PyObject *a = obj_j2c(env, ja);
    PyObject *b = obj_j2c(env, jb);
    int result = PyDict_Merge(a, b, override);
    return (jboolean) result;
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_Update(JNIEnv *env, jclass, jobject ja,
                                                        jobject jb) {
    PyObject *a = obj_j2c(env, ja);
    PyObject *b = obj_j2c(env, jb);
    int result = PyDict_Update(a, b);
    return (jboolean) result;
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_container_PyDict_ClearFreeList(JNIEnv *, jclass) {
    int result = PyDict_ClearFreeList();
    return (jboolean) result;
}

}
#pragma clang diagnostic pop