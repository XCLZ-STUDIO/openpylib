package com.xclz.openpylib.abstracts;


import com.xclz.openpylib.objects.basic.PyObject;

public interface PyNumber {
    default PyObject add(PyNumber o) {
        return _PyNumber.Add(this, o);
    }

    default PyObject subtract(PyNumber o) {
        return _PyNumber.Subtract(this, o);
    }

    default PyObject multiply(PyNumber o) {
        return _PyNumber.Multiply(this, o);
    }

    default PyObject matrixMultiply(PyNumber o) {
        return _PyNumber.MatrixMultiply(this, o);
    }

    default PyObject floorDivide(PyNumber o) {
        return _PyNumber.FloorDivide(this, o);
    }

    default PyObject trueDiv(PyNumber o) {
        return _PyNumber.TrueDiv(this, o);
    }

    default PyObject remainder(PyNumber o) {
        return _PyNumber.Remainder(this, o);
    }

    default PyObject divmod(PyNumber o) {
        return _PyNumber.Divmod(this, o);
    }

    default PyObject power(PyNumber o, PyNumber o2) {
        return _PyNumber.Power(this, o, o2);
    }

    default PyObject negative() {
        return _PyNumber.Negative(this);
    }

    default PyObject positive() {
        return _PyNumber.Positive(this);
    }

    default PyObject absolute() {
        return _PyNumber.Absolute(this);
    }

    default PyObject invert() {
        return _PyNumber.Invert(this);
    }

    default PyObject lshift(PyNumber o) {
        return _PyNumber.Lshift(this, o);
    }

    default PyObject rshift(PyNumber o) {
        return _PyNumber.Rshift(this, o);
    }

    default PyObject and(PyNumber o) {
        return _PyNumber.And(this, o);
    }

    default PyObject or(PyNumber o) {
        return _PyNumber.Or(this, o);
    }

    default PyObject xor(PyNumber o) {
        return _PyNumber.Xor(this, o);
    }

    default PyObject inPlaceAdd(PyNumber o) {
        return _PyNumber.InPlaceAdd(this, o);
    }

    default PyObject inPlaceSubtract(PyNumber o) {
        return _PyNumber.InPlaceSubtract(this, o);
    }

    default PyObject inPlaceMultiply(PyNumber o) {
        return _PyNumber.InPlaceMultiply(this, o);
    }

    default PyObject inPlaceMatrixMultiply(PyNumber o) {
        return _PyNumber.InPlaceMatrixMultiply(this, o);
    }

    default PyObject inPlaceFloorDivide(PyNumber o) {
        return _PyNumber.InPlaceFloorDivide(this, o);
    }

    default PyObject inPlaceTrueDivide(PyNumber o) {
        return _PyNumber.InPlaceTrueDivide(this, o);
    }

    default PyObject inPlaceRemainder(PyNumber o) {
        return _PyNumber.InPlaceRemainder(this, o);
    }

    default PyObject inPlacePower(PyNumber o, PyNumber o2) {
        return _PyNumber.InPlacePower(this, o, o2);
    }

    default PyObject inPlaceLshift(PyNumber o) {
        return _PyNumber.InPlaceLshift(this, o);
    }

    default PyObject inPlaceRshift(PyNumber o) {
        return _PyNumber.InPlaceRshift(this, o);
    }

    default PyObject inPlaceAnd(PyNumber o) {
        return _PyNumber.InPlaceAnd(this, o);
    }

    default PyObject inPlaceXor(PyNumber o) {
        return _PyNumber.InPlaceXor(this, o);
    }

    default PyObject inPlaceOr(PyNumber o) {
        return _PyNumber.InPlaceOr(this, o);
    }

    default PyObject Long() {
        return _PyNumber.Long(this);
    }

    default PyObject Float() {
        return _PyNumber.Float(this);
    }

    default PyObject index() {
        return _PyNumber.Index(this);
    }

    default PyObject toBase(int base) {
        return _PyNumber.ToBase(this, base);
    }
}


class _PyNumber {
    /*TODO Check*/
    public static native PyObject Add(PyNumber o1, PyNumber o2);

    public static native PyObject Subtract(PyNumber o1, PyNumber o2);

    public static native PyObject Multiply(PyNumber o1, PyNumber o2);

    public static native PyObject MatrixMultiply(PyNumber o1, PyNumber o2);

    public static native PyObject FloorDivide(PyNumber o1, PyNumber o2);

    public static native PyObject TrueDiv(PyNumber o1, PyNumber o2);

    public static native PyObject Remainder(PyNumber o1, PyNumber o2);

    public static native PyObject Divmod(PyNumber o1, PyNumber o2);

    public static native PyObject Power(PyNumber o1, PyNumber o2, PyNumber o3);

    public static native PyObject Negative(PyNumber o);

    public static native PyObject Positive(PyNumber o);

    public static native PyObject Absolute(PyNumber o);

    public static native PyObject Invert(PyNumber o);

    public static native PyObject Lshift(PyNumber o1, PyNumber o2);

    public static native PyObject Rshift(PyNumber o1, PyNumber o2);

    public static native PyObject And(PyNumber o1, PyNumber o2);

    public static native PyObject Xor(PyNumber o1, PyNumber o2);

    public static native PyObject Or(PyNumber o1, PyNumber o2);

    public static native PyObject InPlaceAdd(PyNumber o1, PyNumber o2);

    public static native PyObject InPlaceSubtract(PyNumber o1, PyNumber o2);

    public static native PyObject InPlaceMultiply(PyNumber o1, PyNumber o2);

    public static native PyObject InPlaceMatrixMultiply(PyNumber o1, PyNumber o2);

    public static native PyObject InPlaceFloorDivide(PyNumber o1, PyNumber o2);

    public static native PyObject InPlaceTrueDivide(PyNumber o1, PyNumber o2);

    public static native PyObject InPlaceRemainder(PyNumber o1, PyNumber o2);

    public static native PyObject InPlacePower(PyNumber o1, PyNumber o2, PyNumber o3);

    public static native PyObject InPlaceLshift(PyNumber o1, PyNumber o2);

    public static native PyObject InPlaceRshift(PyNumber o1, PyNumber o2);

    public static native PyObject InPlaceAnd(PyNumber o1, PyNumber o2);

    public static native PyObject InPlaceXor(PyNumber o1, PyNumber o2);

    public static native PyObject InPlaceOr(PyNumber o1, PyNumber o2);

    public static native PyObject Long(PyNumber o);

    public static native PyObject Float(PyNumber o);

    public static native PyObject Index(PyNumber o);

    public static native PyObject ToBase(PyNumber o, int base);

}