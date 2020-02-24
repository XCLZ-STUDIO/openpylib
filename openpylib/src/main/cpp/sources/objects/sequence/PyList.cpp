#include "globals.hpp"

extern "C" {

JNIEXPORT jobject Java_com_xclz_openpylib_objects_sequence__1PyList_New(JNIEnv *env, jclass, jlong length) {

    PyObject *obj = PyList_New(length);
    jobject result = env->NewObject(PyList_class, PyList_init);
    env->SetLongField(result, mPointer_field, (jlong)obj);
    return result;
}

}