package com.xclz.openpylib.abstracts;


public interface PyNumber {
    default PyNumber add(PyNumber o) {
        return _PyNumber.Add(this, o);
    }

    default PyNumber subtract(PyNumber o) {
        return _PyNumber.Subtract(this, o);
    }

    default PyNumber multiply(PyNumber o) {
        return _PyNumber.Multiply(this, o);
    }

    default PyNumber matrixMultiply(PyNumber o) {
        return _PyNumber.MatrixMultiply(this, o);
    }

    default PyNumber floorDivide(PyNumber o) {
        return _PyNumber.FloorDivide(this, o);
    }

    default PyNumber trueDiv(PyNumber o) {
        return _PyNumber.TrueDiv(this, o);
    }

    default PyNumber remainder(PyNumber o) {
        return _PyNumber.Remainder(this, o);
    }

    default PyNumber divmod(PyNumber o) {
        return _PyNumber.Divmod(this, o);
    }

    default PyNumber power(PyNumber o, PyNumber o2) {
        return _PyNumber.Power(this, o, o2);
    }

    default PyNumber negative() {
        return _PyNumber.Negative(this);
    }

    default PyNumber positive() {
        return _PyNumber.Positive(this);
    }

    default PyNumber absolute() {
        return _PyNumber.Absolute(this);
    }

    default PyNumber invert() {
        return _PyNumber.Invert(this);
    }

    default PyNumber lshift(PyNumber o) {
        return _PyNumber.Lshift(this, o);
    }

    default PyNumber rshift(PyNumber o) {
        return _PyNumber.Rshift(this, o);
    }

    default PyNumber and(PyNumber o) {
        return _PyNumber.And(this, o);
    }

    default PyNumber or(PyNumber o) {
        return _PyNumber.Or(this, o);
    }

    default PyNumber xor(PyNumber o) {
        return _PyNumber.Xor(this, o);
    }

    default PyNumber inPlaceAdd(PyNumber o) {
        return _PyNumber.InPlaceAdd(this, o);
    }

    default PyNumber inPlaceSubtract(PyNumber o) {
        return _PyNumber.InPlaceSubtract(this, o);
    }

    default PyNumber inPlaceMultiply(PyNumber o) {
        return _PyNumber.InPlaceMultiply(this, o);
    }

    default PyNumber inPlaceMatrixMultiply(PyNumber o) {
        return _PyNumber.InPlaceMatrixMultiply(this, o);
    }

    default PyNumber inPlaceFloorDivide(PyNumber o) {
        return _PyNumber.InPlaceFloorDivide(this, o);
    }

    default PyNumber inPlaceTrueDivide(PyNumber o) {
        return _PyNumber.InPlaceTrueDivide(this, o);
    }

    default PyNumber inPlaceRemainder(PyNumber o) {
        return _PyNumber.InPlaceRemainder(this, o);
    }

    default PyNumber inPlacePower(PyNumber o, PyNumber o2) {
        return _PyNumber.InPlacePower(this, o, o2);
    }

    default PyNumber inPlaceLshift(PyNumber o) {
        return _PyNumber.InPlaceLshift(this, o);
    }

    default PyNumber inPlaceRshift(PyNumber o) {
        return _PyNumber.InPlaceRshift(this, o);
    }

    default PyNumber inPlaceAnd(PyNumber o) {
        return _PyNumber.InPlaceAnd(this, o);
    }

    default PyNumber inPlaceXor(PyNumber o) {
        return _PyNumber.InPlaceXor(this, o);
    }

    default PyNumber inPlaceOr(PyNumber o) {
        return _PyNumber.InPlaceOr(this, o);
    }

    default PyNumber Long() {
        return _PyNumber.Long(this);
    }

    default PyNumber Float() {
        return _PyNumber.Float(this);
    }

    default PyNumber index() {
        return _PyNumber.Index(this);
    }

    default PyNumber toBase(int base) {
        return _PyNumber.ToBase(this, base);
    }
}


class _PyNumber {
    /*TODO Check*/

    public static native PyNumber Add(PyNumber o1, PyNumber o2);

    public static native PyNumber Subtract(PyNumber o1, PyNumber o2);

    public static native PyNumber Multiply(PyNumber o1, PyNumber o2);

    public static native PyNumber MatrixMultiply(PyNumber o1, PyNumber o2);

    public static native PyNumber FloorDivide(PyNumber o1, PyNumber o2);

    public static native PyNumber TrueDiv(PyNumber o1, PyNumber o2);

    public static native PyNumber Remainder(PyNumber o1, PyNumber o2);

    public static native PyNumber Divmod(PyNumber o1, PyNumber o2);

    public static native PyNumber Power(PyNumber o1, PyNumber o2, PyNumber o3);

    public static native PyNumber Negative(PyNumber o);

    public static native PyNumber Positive(PyNumber o);

    public static native PyNumber Absolute(PyNumber o);

    public static native PyNumber Invert(PyNumber o);

    public static native PyNumber Lshift(PyNumber o1, PyNumber o2);

    public static native PyNumber Rshift(PyNumber o1, PyNumber o2);

    public static native PyNumber And(PyNumber o1, PyNumber o2);

    public static native PyNumber Xor(PyNumber o1, PyNumber o2);

    public static native PyNumber Or(PyNumber o1, PyNumber o2);

    public static native PyNumber InPlaceAdd(PyNumber o1, PyNumber o2);

    public static native PyNumber InPlaceSubtract(PyNumber o1, PyNumber o2);

    public static native PyNumber InPlaceMultiply(PyNumber o1, PyNumber o2);

    public static native PyNumber InPlaceMatrixMultiply(PyNumber o1, PyNumber o2);

    public static native PyNumber InPlaceFloorDivide(PyNumber o1, PyNumber o2);

    public static native PyNumber InPlaceTrueDivide(PyNumber o1, PyNumber o2);

    public static native PyNumber InPlaceRemainder(PyNumber o1, PyNumber o2);

    public static native PyNumber InPlacePower(PyNumber o1, PyNumber o2, PyNumber o3);

    public static native PyNumber InPlaceLshift(PyNumber o1, PyNumber o2);

    public static native PyNumber InPlaceRshift(PyNumber o1, PyNumber o2);

    public static native PyNumber InPlaceAnd(PyNumber o1, PyNumber o2);

    public static native PyNumber InPlaceXor(PyNumber o1, PyNumber o2);

    public static native PyNumber InPlaceOr(PyNumber o1, PyNumber o2);

    public static native PyNumber Long(PyNumber o);

    public static native PyNumber Float(PyNumber o);

    public static native PyNumber Index(PyNumber o);

    public static native PyNumber ToBase(PyNumber o, int base);

}