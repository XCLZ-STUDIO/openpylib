#define PY_SSIZE_T_CLEAN
#include <Python.h>
#include <jni.h>

extern jclass PyBytes_class;
extern jclass PyIter_class;
extern jclass PyList_class;
extern jclass PyObject_class;
extern jclass PyType_class;
extern jclass PyUnicode_class;

extern jfieldID mPointer_field;

extern jmethodID PyBytes_init;
extern jmethodID PyIter_init;
extern jmethodID PyList_init;
extern jmethodID PyObject_init;
extern jmethodID PyType_init;
extern jmethodID PyUnicode_init;

inline PyObject* obj_j2c(JNIEnv *env, jobject jobj) {
    return (PyObject*)env->GetLongField(jobj, mPointer_field);
}

inline jobject obj_c2j(JNIEnv *env, jclass clazz, jmethodID init, PyObject *obj) {
    jobject jobj = env->NewObject(clazz, init);
    env->SetLongField(jobj, mPointer_field, (jlong)obj);
    return jobj;
}


inline jobject NewPyBytes(JNIEnv *env, PyObject *obj) {
    return obj_c2j(env, PyBytes_class, PyBytes_init, obj);
}
inline jobject NewPyIter(JNIEnv *env, PyObject *obj) {
    return obj_c2j(env, PyIter_class, PyIter_init, obj);
}
inline jobject NewPyList(JNIEnv *env, PyObject *obj) {
    return obj_c2j(env, PyList_class, PyList_init, obj);
}
inline jobject NewPyObject(JNIEnv *env, PyObject *obj) {
    return obj_c2j(env, PyObject_class, PyObject_init, obj);
}
inline jobject NewPyType(JNIEnv *env, PyObject *obj) {
    return obj_c2j(env, PyType_class, PyType_init, obj);
}
inline jobject NewPyUnicode(JNIEnv *env, PyObject *obj) {
    return obj_c2j(env, PyUnicode_class, PyUnicode_init, obj);
}