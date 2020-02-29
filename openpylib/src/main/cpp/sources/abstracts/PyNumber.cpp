#include "globals.hpp"

extern "C" {

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_Check(JNIEnv *env, jclass, jobject jobj)  {
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

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_Subtract(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_Subtract(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_Multiply(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_Multiply(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_MatrixMultiply(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_MatrixMultiply(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_FloorDivide(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_FloorDivide(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_TrueDivide(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_TrueDivide(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_Remainder(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_Remainder(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_DivMod(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_Divmod(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_Power(JNIEnv *env, jclass, jobject jo1, jobject jo2, jobject jo3) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *o3 = obj_j2c(env, jo3);
    PyObject *result = PyNumber_Power(o1, o2, o3);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_Negative(JNIEnv *env, jclass, jobject jo) {
    PyObject *o = obj_j2c(env, jo);
    PyObject *result = PyNumber_Negative(o);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_Positive(JNIEnv *env, jclass, jobject jo) {
    PyObject *o = obj_j2c(env, jo);
    PyObject *result = PyNumber_Positive(o);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_Absolute(JNIEnv *env, jclass, jobject jo) {
    PyObject *o = obj_j2c(env, jo);
    PyObject *result = PyNumber_Absolute(o);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_Invert(JNIEnv *env, jclass, jobject jo) {
    PyObject *o = obj_j2c(env, jo);
    PyObject *result = PyNumber_Invert(o);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_Lshift(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_Lshift(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_Rshift(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_Rshift(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_And(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_And(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_Xor(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_Xor(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_Or(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_Or(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_InPlaceAdd(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_InPlaceAdd(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_InPlaceSubtract(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_InPlaceSubtract(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_InPlaceMultiply(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_InPlaceMultiply(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_InPlaceMatrixMultiply(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_InPlaceMatrixMultiply(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_InPlaceFloorDivide(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_InPlaceFloorDivide(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_InPlaceTrueDivide(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_InPlaceTrueDivide(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_InPlaceRemainder(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_InPlaceRemainder(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_InPlacePower(JNIEnv *env, jclass, jobject jo1, jobject jo2, jobject jo3) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *o3 = obj_j2c(env, jo3);
    PyObject *result = PyNumber_InPlacePower(o1, o2, o3);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_InPlaceLshift(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_InPlaceLshift(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_InPlaceRshift(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_InPlaceRshift(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_InPlaceAnd(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_InPlaceAnd(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_InPlaceXor(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_InPlaceXor(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_InPlaceOr(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    PyObject *o1 = obj_j2c(env, jo1);
    PyObject *o2 = obj_j2c(env, jo2);
    PyObject *result = PyNumber_InPlaceOr(o1, o2);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_Long(JNIEnv *env, jclass, jobject jo) {
    PyObject *o = obj_j2c(env, jo);
    PyObject *result = PyNumber_Long(o);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_Float(JNIEnv *env, jclass, jobject jo) {
    PyObject *o = obj_j2c(env, jo);
    PyObject *result = PyNumber_Float(o);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_Index(JNIEnv *env, jclass, jobject jo) {
    PyObject *o = obj_j2c(env, jo);
    PyObject *result = PyNumber_Index(o);
    return NewPyNumber(env, result);
}

JNIEXPORT jobject JNICALL
Java_com_xclz_openpylib_abstracts__1PyNumber_ToBase(JNIEnv *env, jclass, jobject jo, int base) {
    PyObject *o = obj_j2c(env, jo);
    PyObject *result = PyNumber_ToBase(o, base);
    return NewPyNumber(env, result);
}


}