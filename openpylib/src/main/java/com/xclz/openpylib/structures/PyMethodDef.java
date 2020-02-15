package com.xclz.openpylib.structures;

public class PyMethodDef {
    String ml_name;
    long ml_meth; //PyCFunction
    long ml_flags;
    String ml_doc;
}