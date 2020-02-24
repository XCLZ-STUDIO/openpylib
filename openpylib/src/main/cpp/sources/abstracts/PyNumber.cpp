#include <Python.h>
#include <jni.h>

extern "C" {

JNIEXPORT jobject Java_com_xclz_openpylib_abstracts__1PyNumber_Add(JNIEnv *env, jclass, jobject jo1, jobject jo2) {
    jclass PyObject_class = env->FindClass("com/xclz/openpylib/objects/basic/PyObject");
    jfieldID mPointer_field = env->GetFieldID(PyObject_class, "mPointer", "J");
    jmethodID PyObject_init = env->GetMethodID(PyObject_class, "<init>", "(I)V");

    auto o1 = (PyObject*)env->GetLongField(jo1, mPointer_field);
    auto o2 = (PyObject*)env->GetLongField(jo2, mPointer_field);
    auto result = PyNumber_Add(o1, o2);

    return env->NewObject(PyObject_class, PyObject_init, (jlong)result);
}

}