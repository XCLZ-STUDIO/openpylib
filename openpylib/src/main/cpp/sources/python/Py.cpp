#include <Python.h>
#include <jni.h>

extern "C" {

JNIEXPORT void JNICALL
Java_com_xclz_openpylib_python_Py__1Incref(JNIEnv *env, jclass, jobject jobj) {
    jclass PyObject_class = env->FindClass("com/xclz/openpylib/objects/basic/PyObject");
    jfieldID mPointer_field = env->GetFieldID(PyObject_class, "mPointer", "J");
    auto *obj = (PyObject *) env->GetLongField(jobj, mPointer_field);
    Py_INCREF(obj);
}

JNIEXPORT void JNICALL
Java_com_xclz_openpylib_python_Py__1Decref(JNIEnv *env, jclass, jobject jobj) {
    jclass PyObject_class = env->FindClass("com/xclz/openpylib/objects/basic/PyObject");
    jfieldID mPointer_field = env->GetFieldID(PyObject_class, "mPointer", "J");
    auto *obj = (PyObject *) env->GetLongField(jobj, mPointer_field);
    Py_DECREF(obj);
}

JNIEXPORT void JNICALL
Java_com_xclz_openpylib_python_Py_tempFunction(JNIEnv *env, jclass, jstring path) {
    const char *c_path = env->GetStringUTFChars(path, nullptr);
    setenv("PYTHONHOME", c_path, true);
    env->ReleaseStringUTFChars(path, c_path);
}
JNIEXPORT void JNICALL Java_com_xclz_openpylib_python_Py_Initialize(JNIEnv *, jclass) {
    Py_Initialize();
}

JNIEXPORT void JNICALL
Java_com_xclz_openpylib_python_Py_InitializeEx(JNIEnv *, jclass, jint initsigs) {
    Py_InitializeEx(initsigs);
}

JNIEXPORT jboolean JNICALL Java_com_xclz_openpylib_python_Py_IsInitialized(JNIEnv *, jclass) {
    return (jboolean) Py_IsInitialized();
}

JNIEXPORT jboolean JNICALL Java_com_xclz_openpylib_python_Py_FinalizeEx(JNIEnv *, jclass) {
    return (jboolean) Py_FinalizeEx();
}

JNIEXPORT void JNICALL Java_com_xclz_openpylib_python_Py_Finalize(JNIEnv *, jclass) {
    Py_Finalize();
}

}