#include "globals.hpp"

extern "C" {

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_HasAttr(JNIEnv *env, jclass, jobject jobj,
                                                       jobject jname) {
   PyObject *obj = obj_j2c(env, jobj);
   PyObject *name = obj_j2c(env, jname);
   int result = PyObject_HasAttr(obj, name);
   return (jboolean)result;
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_HasAttrString(JNIEnv *env, jclass, jobject jobj,
                                                             jstring jname) {
    PyObject *obj = obj_j2c(env, jobj);
    const char *name = env->GetStringUTFChars(jname, nullptr);
    int result = PyObject_HasAttrString(obj, name);
    env->ReleaseStringUTFChars(jname, name);
    return (jboolean)result;
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_GetAttr(JNIEnv *env, jclass, jobject jobj,
                                                       jobject jname) {
   PyObject *obj = obj_j2c(env, jobj);
   PyObject *name = obj_j2c(env, jname);
   return NewPyObject(env, PyObject_GetAttr(obj, name));
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_GetAttrString(JNIEnv *env, jclass, jobject jobj,
                                                             jstring jname) {
    PyObject *obj = obj_j2c(env, jobj);
    const char *name = env->GetStringUTFChars(jname, nullptr);
    PyObject *result = PyObject_GetAttrString(obj, name);
    env->ReleaseStringUTFChars(jname, name);
    return NewPyObject(env, result);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_DelAttr(JNIEnv *env, jclass, jobject jobj,
                                                       jobject jname) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *name = obj_j2c(env, jname);
    int result = PyObject_DelAttr(obj, name);
    return bool_c2j(result);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_DelAttrString(JNIEnv *env, jclass, jobject jobj,
                                                             jstring jname) {
    PyObject *obj = obj_j2c(env, jobj);
    const char *name = env->GetStringUTFChars(jname, nullptr);
    int result = PyObject_DelAttrString(obj, name);
    env->ReleaseStringUTFChars(jname, name);
    return bool_c2j(result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_RichCompare(JNIEnv *env, jclass, jobject jobj1,
                                                           jobject jobj2, jint opid) {
    PyObject *obj1 = obj_j2c(env, jobj1);
    PyObject *obj2 = obj_j2c(env, jobj2);
    PyObject *result = PyObject_RichCompare(obj1, obj2, opid);
    return NewPyObject(env, result);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_RichCompareBool(JNIEnv *env, jclass, jobject jobj1,
                                                               jobject jobj2, jint opid) {
    PyObject *obj1 = obj_j2c(env, jobj1);
    PyObject *obj2 = obj_j2c(env, jobj2);
    int result = PyObject_RichCompareBool(obj1, obj2, opid);
    return (jboolean)result;
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_IsInstance(JNIEnv *env, jclass, jobject jinst,
                                                          jobject jcls) {
    PyObject *inst = obj_j2c(env, jinst);
    PyObject *cls = obj_j2c(env, jcls);
    int result = PyObject_IsInstance(inst, cls);
    return (jboolean)result;
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_Repr(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyObject_Repr(obj);
    return NewPyUnicode(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_ASCII(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyObject_ASCII(obj);
    return NewPyUnicode(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_Str(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyObject_Str(obj);
    return NewPyUnicode(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_Bytes(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyObject_Bytes(obj);
    return NewPyBytes(env, result);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_Hash(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyObject_Hash(obj);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_IsTrue(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    int result = PyObject_IsTrue(obj);
    return (jboolean)result;
}

JNIEXPORT jint JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_Not(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyObject_Not(obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_Type(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyObject_Type(obj);
    return NewPyType(env, result);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_Size(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyObject_Size(obj);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_Length(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyObject_Length(obj);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_LengthHint(JNIEnv *env, jclass, jobject jobj,
                                                          jlong publicValue) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyObject_LengthHint(obj, publicValue);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_GetItem(JNIEnv *env, jclass, jobject jobj,
                                                       jobject jkey) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *key= obj_j2c(env, jkey);
    PyObject *result = PyObject_GetItem(obj, key);
    return NewPyObject(env, result);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_SetItem(JNIEnv *env, jclass, jobject jobj,
                                                       jobject jkey, jobject jvalue) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *key = obj_j2c(env, jkey);
    PyObject *value= obj_j2c(env, jvalue);
    int result = PyObject_SetItem(obj, key, value);
    return bool_c2j(result);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_DelItem(JNIEnv *env, jclass, jobject jobj,
                                                       jobject jkey) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *key= obj_j2c(env, jkey);
    int result = PyObject_DelItem(obj, key);
    return bool_c2j(result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_Dir(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyObject_Dir(obj);
    return NewPyList(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_basic_PyObject_GetIter(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyObject_GetIter(obj);
    return NewPyObject(env, result);
}

}