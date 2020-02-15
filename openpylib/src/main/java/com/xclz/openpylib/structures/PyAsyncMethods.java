package com.xclz.openpylib.structures;

public class PyAsyncMethods {
    long am_await; //PyObject * (*unaryfunc)(PyObject *);
    long am_aiter; //PyObject * (*unaryfunc)(PyObject *);
    long am_anext; //PyObject * (*unaryfunc)(PyObject *);
}