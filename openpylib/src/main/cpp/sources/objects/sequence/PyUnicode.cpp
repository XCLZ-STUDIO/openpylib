#include "globals.hpp"

extern "C" {

JNIEXPORT jint JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_ClearFreeList(JNIEnv*, jclass) {
    return PyUnicode_ClearFreeList();
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_Check(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyUnicode_Check(obj))
        return nullptr;
    return NewPyUnicode(env, obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_CheckExact(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    if (!PyUnicode_CheckExact(obj))
        return nullptr;
    return NewPyUnicode(env, obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_AsString(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    const char *result = PyUnicode_AsUTF8(obj);
    return env->NewStringUTF(result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_FromString(JNIEnv *env, jclass, jstring jstr) {
    const char *str = env->GetStringUTFChars(jstr, nullptr);
    PyObject *result = PyUnicode_FromString(str);
    env->ReleaseStringUTFChars(jstr, str);
    return NewPyUnicode(env, result);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_Length(JNIEnv *env, jclass, jobject jobj) {
    PyObject *obj = obj_j2c(env, jobj);
    return PyUnicode_GET_LENGTH(obj);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_Concat(JNIEnv *env, jclass, jobject jleft, jobject jright) {
    PyObject *left = obj_j2c(env, jleft);
    PyObject *right = obj_j2c(env, jright);
    PyObject *result = PyUnicode_Concat(left, right);
    return NewPyUnicode(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_Split(JNIEnv *env, jclass, jobject jobj, jobject jseq, jlong max_split) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *seq = obj_j2c(env, jseq);
    PyObject *result = PyUnicode_Split(obj, seq, max_split);
    return NewPyList(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_SplitLines(JNIEnv *env, jclass, jobject jobj, jboolean keep_end) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *result = PyUnicode_Splitlines(obj, keep_end);
    return NewPyList(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_Translate(JNIEnv *env, jclass, jobject jobj, jobject jtable, jstring jerrors) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *table = obj_j2c(env, jtable);
    const char *errors = env->GetStringUTFChars(jerrors, nullptr);
    PyObject *result = PyUnicode_Translate(obj, table, errors);
    env->ReleaseStringUTFChars(jerrors, errors);
    return NewPyUnicode(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_Join(JNIEnv *env, jclass, jobject jobj, jobject jseq) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *seq = obj_j2c(env, jseq);
    PyObject *result = PyUnicode_Join(obj, seq);
    return NewPyUnicode(env, result);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_TailMatch(JNIEnv *env, jclass, jobject jobj, jobject jsub, jlong start, jlong end, jint direction) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *sub = obj_j2c(env, jsub);
    return PyUnicode_Tailmatch(obj, sub, start, end, direction);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_Find(JNIEnv *env, jclass, jobject jobj, jobject jsub, jlong start, jlong end, jint direction) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *sub = obj_j2c(env, jsub);
    return PyUnicode_Find(obj, sub, start, end, direction);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_Count(JNIEnv *env, jclass, jobject jobj, jobject jsub, jlong start, jlong end) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *sub = obj_j2c(env, jsub);
    return PyUnicode_Count(obj, sub, start, end);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_Replace(JNIEnv *env, jclass, jobject jobj, jobject jsub, jobject jrep, jlong max_count) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *sub = obj_j2c(env, jsub);
    PyObject *rep = obj_j2c(env, jrep);
    PyObject *result = PyUnicode_Replace(obj, sub, rep, max_count);
    return NewPyUnicode(env, result);
}

JNIEXPORT jint JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_Compare(JNIEnv *env, jclass, jobject jleft, jobject jright) {
    PyObject *left = obj_j2c(env, jleft);
    PyObject *right = obj_j2c(env, jright);
    PyObject *result =return PyUnicode_Compare(left, right);
}

JNIEXPORT jint JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_CompareWithASCII(JNIEnv *env, jclass, jobject jobj, jstring jstr) {
    PyObject *obj = obj_j2c(env, jobj);
    const char *str = env->GetStringUTFChars(jstr, nullptr);
    int result = PyUnicode_CompareWithASCIIString(obj, str);
    env->ReleaseStringUTFChars(jstr, str);
    return result;
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_RichCompare(JNIEnv *env, jclass, jobject jleft, jobject jright, jint op) {
    PyObject *left = obj_j2c(env, jleft);
    PyObject *right = obj_j2c(env, jright);
    PyObject *result = PyUnicode_RichCompare(left, right, op);
    return NewPyObject(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_Format(JNIEnv *env, jclass, jobject jformat, jobject jargs) {
    PyObject *format = obj_j2c(env, jformat);
    PyObject *args = obj_j2c(env, jargs);
    PyObject *result = PyUnicode_Format(format, args);
    return NewPyUnicode(env, result);
}

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_sequence_PyUnicode_Contains(JNIEnv *env, jclass, jobject jobj, jobject jsub) {
    PyObject *obj = obj_j2c(env, jobj);
    PyObject *sub = obj_j2c(env, jsub);
    int result = PyUnicode_Contains(obj, sub);
    return bool_c2j(result);
}


}