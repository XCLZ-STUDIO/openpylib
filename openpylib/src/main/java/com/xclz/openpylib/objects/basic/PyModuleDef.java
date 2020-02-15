package com.xclz.openpylib.objects.basic;

import com.xclz.openpylib.structures.PyMethodDef;
import com.xclz.openpylib.structures.PyModuleDef_Slot;

public class PyModuleDef extends PyModuleDef_Base {
    String m_name;
    String m_doc;
    long m_size;
    PyMethodDef[] m_methods;
    PyModuleDef_Slot[] m_slots;
    long m_traverse; //TODO int (*traverseproc)(PyObject *self, visitproc visit, void *arg)
    long m_clear; //TODO int (*inquiry)(PyObject *self)
    long m_free; //TODO void (*freefunc)(void *)
}