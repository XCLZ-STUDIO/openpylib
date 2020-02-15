#include <Python.h>
#include <jni.h>

extern "C" {

JNIEXPORT jboolean JNICALL
Java_com_xclz_openpylib_objects_basic__1PyObject_HasAttr(JNIEnv *env, jclass clazz, jobject jobj, jobject jname) {
    jfieldID mPointer_field = env->GetFieldID(clazz, "mPointer", "J");
    auto *obj = (PyObject*)env->GetLongField(jobj, mPointer_field);
    auto *name = (PyObject*)env->GetLongField(jname, mPointer_field);
    return (jboolean)PyObject_HasAttr(obj, name);
}

JNIEXPORT jlong JNICALL
Java_com_xclz_openpylib_objects_basic__1PyObject_Size(JNIEnv *env, jclass clazz, jobject jobj) {
    jfieldID mPointer_field = env->GetFieldID(clazz, "mPointer", "J");
    auto *obj = (PyObject*)env->GetLongField(jobj, mPointer_field);
    return PyObject_Size(obj);
}

}