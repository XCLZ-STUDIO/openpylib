#include "globals.hpp"

jclass _PyNumber_class = nullptr;
jclass PyBytes_class = nullptr;
jclass PyDict_class = nullptr;
jclass PyFloat_class = nullptr;
jclass PyObject_class = nullptr;
jclass PyList_class = nullptr;
jclass PyType_class = nullptr;
jclass PyUnicode_class = nullptr;

jfieldID mPointer_field = nullptr;

jmethodID _PyNumber_init = nullptr;
jmethodID PyBytes_init = nullptr;
jmethodID PyDict_init = nullptr;
jmethodID PyList_init = nullptr;
jmethodID PyObject_init = nullptr;
jmethodID PyType_init = nullptr;
jmethodID PyUnicode_init = nullptr;

static void init_class(JNIEnv *env) {
    _PyNumber_class = (jclass) env->NewGlobalRef(env->FindClass("com/xclz/openpylib/abstracts/_PyNumber"));
    PyBytes_class = (jclass)env->NewGlobalRef(env->FindClass("com/xclz/openpylib/objects/sequence/PyBytes"));
    PyDict_class = (jclass) env->NewGlobalRef(env->FindClass("com/xclz/openpylib/objects/container/PyDict"));
    PyList_class = (jclass)env->NewGlobalRef(env->FindClass("com/xclz/openpylib/objects/sequence/PyList"));
    PyFloat_class = (jclass)env->NewGlobalRef(env->FindClass("com/xclz/openpylib/objects/number/PyFloat"));
    PyObject_class = (jclass)env->NewGlobalRef(env->FindClass("com/xclz/openpylib/objects/basic/PyObject"));
    PyType_class = (jclass)env->NewGlobalRef(env->FindClass("com/xclz/openpylib/objects/basic/PyObject"));
    PyUnicode_class = (jclass)env->NewGlobalRef(env->FindClass("com/xclz/openpylib/objects/sequence/PyUnicode"));

    mPointer_field = env->GetFieldID(PyObject_class, "mPointer", "J");

//    _PyNumber_init = env->GetMethodID(_PyNumber_class, "<init>", "()V");
//    PyBytes_init = env->GetMethodID(PyBytes_class, "<init>", "()V");
//    PyDict_init = env->GetMethodID(PyDict_class, "<init>", "()V");
//    PyList_init = env->GetMethodID(PyList_class, "<init>", "()V");
    PyObject_init = env->GetMethodID(PyObject_class, "<init>", "()V");
//    PyType_init = env->GetMethodID(PyType_class, "<init>", "()V");
//    PyUnicode_init = env->GetMethodID(PyUnicode_class, "<init>", "()V");
}

extern "C" {

jint JNI_OnLoad(JavaVM *vm, void*) {
    JNIEnv *env = nullptr;
    if (vm->GetEnv((void**)&env, JNI_VERSION_1_6) != JNI_OK) {
        //TODO raise error
    }

    init_class(env);
    return JNI_VERSION_1_6;
}

}