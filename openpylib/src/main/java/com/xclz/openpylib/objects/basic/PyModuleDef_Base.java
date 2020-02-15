package com.xclz.openpylib.objects.basic;

public class PyModuleDef_Base extends PyObject {
    long m_init = 0; //TODO PyObject* (*m_init)(void);
    long m_index = 0;
    PyObject m_copy = null;
}