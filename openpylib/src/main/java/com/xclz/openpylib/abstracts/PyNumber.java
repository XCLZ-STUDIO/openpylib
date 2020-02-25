package com.xclz.openpylib.abstracts;


import com.xclz.openpylib.objects.basic.PyObject;

public interface PyNumber {
    static PyNumber Add(PyNumber o1, PyNumber o2) {
        return _PyNumber.Add(o1, o2);
    }

    static PyNumber Sub(PyNumber o1, PyNumber o2) {
        return _PyNumber.Subtract(o1, o2);
    }

    static PyNumber Mul(PyNumber o1, PyNumber o2) {
        return _PyNumber.Multiply(o1, o2);
    }

    static PyNumber MatMul(PyNumber o1, PyNumber o2) {
        return _PyNumber.MatrixMultiply(o1, o2);
    }

    static PyNumber FloorDiv(PyNumber o1, PyNumber o2) {
        return _PyNumber.FloorDivide(o1, o2);
    }

    static PyNumber TrueDiv(PyNumber o1, PyNumber o2) {
        return _PyNumber.TrueDiv(o1, o2);
    }

    static PyNumber Rem(PyNumber o1, PyNumber o2) {
        return _PyNumber.Remainder(o1, o2);
    }

    static PyNumber DivMod(PyNumber o1, PyNumber o2) {
        return _PyNumber.DivMod(o1, o2);
    }

    static PyNumber Pow(PyNumber o1, PyNumber o2, PyNumber o3) {
        return _PyNumber.Power(o1, o2, o3);
    }

    static PyNumber Neg(PyNumber o) {
        return _PyNumber.Negative(o);
    }

    static PyNumber Pos(PyNumber o) {
        return _PyNumber.Positive(o);
    }

    static PyNumber Abs(PyNumber o) {
        return _PyNumber.Absolute(o);
    }

    static PyNumber Invert(PyNumber o) {
        return _PyNumber.Invert(o);
    }

    static PyNumber Lshift(PyNumber o1, PyNumber o2) {
        return _PyNumber.Lshift(o1, o2);
    }

    static PyNumber Rshift(PyNumber o1, PyNumber o2) {
        return _PyNumber.Rshift(o1, o2);
    }

    static PyNumber And(PyNumber o1, PyNumber o2) {
        return _PyNumber.And(o1, o2);
    }

    static PyNumber Xor(PyNumber o1, PyNumber o2) {
        return _PyNumber.Xor(o1, o2);
    }

    static PyNumber Or(PyNumber o1, PyNumber o2) {
        return _PyNumber.Or(o1, o2);
    }

    static PyNumber InAdd(PyNumber o1, PyNumber o2) {
        return _PyNumber.InPlaceAdd(o1, o2);
    }

    static PyNumber InSub(PyNumber o1, PyNumber o2) {
        return _PyNumber.InPlaceSubtract(o1, o2);
    }

    static PyNumber InMul(PyNumber o1, PyNumber o2) {
        return _PyNumber.InPlaceMultiply(o1, o2);
    }

    static PyNumber InMatMul(PyNumber o1, PyNumber o2) {
        return _PyNumber.InPlaceMatrixMultiply(o1, o2);
    }

    static PyNumber InFloorDiv(PyNumber o1, PyNumber o2) {
        return _PyNumber.InPlaceFloorDivide(o1, o2);
    }

    static PyNumber InTrueDiv(PyNumber o1, PyNumber o2) {
        return _PyNumber.InPlaceTrueDivide(o1, o2);
    }

    static PyNumber InRem(PyNumber o1, PyNumber o2) {
        return _PyNumber.InPlaceRemainder(o1, o2);
    }

    static PyNumber InPow(PyNumber o1, PyNumber o2, PyNumber o3) {
        return _PyNumber.InPlacePower(o1, o2, o3);
    }

    static PyNumber InLshift(PyNumber o1, PyNumber o2) {
        return _PyNumber.InPlaceLshift(o1, o2);
    }

    static PyNumber InRshift(PyNumber o1, PyNumber o2) {
        return _PyNumber.InPlaceRshift(o1, o2);
    }

    static PyNumber InAnd(PyNumber o1, PyNumber o2) {
        return _PyNumber.InPlaceAnd(o1, o2);
    }

    static PyNumber InXor(PyNumber o1, PyNumber o2) {
        return _PyNumber.InPlaceXor(o1, o2);
    }

    static PyNumber InOr(PyNumber o1, PyNumber o2) {
        return _PyNumber.InPlaceOr(o1, o2);
    }

    static PyNumber ToLong(PyNumber o) {
        return _PyNumber.Long(o);
    }

    static PyNumber ToFloat(PyNumber o) {
        return _PyNumber.Float(o);
    }

    static PyNumber ToIndex(PyNumber o) {
        return _PyNumber.Index(o);
    }

    static PyNumber ToBase(PyNumber o, int base) {
        return _PyNumber.ToBase(o, base);
    }


    default PyNumber add(PyNumber other) {
        return Add(this, other);
    }

    default PyNumber sub(PyNumber other) {
        return Sub(this, other);
    }

    default PyNumber mul(PyNumber other) {
        return Mul(this, other);
    }

    default PyNumber matMul(PyNumber other) {
        return MatMul(this, other);
    }

    default PyNumber floorDiv(PyNumber other) {
        return FloorDiv(this, other);
    }

    default PyNumber trueDiv(PyNumber other) {
        return TrueDiv(this, other);
    }

    default PyNumber rem(PyNumber other) {
        return Rem(this, other);
    }

    default PyNumber divmod(PyNumber other) {
        return DivMod(this, other);
    }

    default PyNumber pow(PyNumber other, PyNumber o2) {
        return Pow(this, other, o2);
    }

    default PyNumber neg() {
        return Neg(this);
    }

    default PyNumber pos() {
        return Pos(this);
    }

    default PyNumber abs() {
        return Abs(this);
    }

    default PyNumber invert() {
        return Invert(this);
    }

    default PyNumber lshift(PyNumber other) {
        return Lshift(this, other);
    }

    default PyNumber rshift(PyNumber other) {
        return Rshift(this, other);
    }

    default PyNumber and(PyNumber other) {
        return And(this, other);
    }

    default PyNumber or(PyNumber other) {
        return Or(this, other);
    }

    default PyNumber xor(PyNumber other) {
        return Xor(this, other);
    }

    default PyNumber inAdd(PyNumber other) {
        return InAdd(this, other);
    }

    default PyNumber inSub(PyNumber other) {
        return InSub(this, other);
    }

    default PyNumber inMul(PyNumber other) {
        return InMul(this, other);
    }

    default PyNumber inMatMul(PyNumber other) {
        return InMatMul(this, other);
    }

    default PyNumber inFloorDiv(PyNumber other) {
        return InFloorDiv(this, other);
    }

    default PyNumber inTrueDiv(PyNumber other) {
        return InTrueDiv(this, other);
    }

    default PyNumber inRem(PyNumber other) {
        return InRem(this, other);
    }

    default PyNumber inPow(PyNumber other, PyNumber o2) {
        return InPow(this, other, o2);
    }

    default PyNumber inLshift(PyNumber other) {
        return InLshift(this, other);
    }

    default PyNumber inRshift(PyNumber other) {
        return InRshift(this, other);
    }

    default PyNumber inAnd(PyNumber other) {
        return InAnd(this, other);
    }

    default PyNumber inXor(PyNumber other) {
        return InXor(this, other);
    }

    default PyNumber inOr(PyNumber other) {
        return InOr(this, other);
    }

    default PyNumber toLong() {
        return ToLong(this);
    }

    default PyNumber toFloat() {
        return ToFloat(this);
    }

    default PyNumber toIndex() {
        return ToIndex(this);
    }

    default PyNumber toBase(int base) {
        return ToBase(this, base);
    }
}


class _PyNumber extends PyObject implements PyNumber {
    /*TODO Check*/
    public static native PyNumber Add(PyNumber o1, PyNumber o2);

    public static native PyNumber Subtract(PyNumber o1, PyNumber o2);

    public static native PyNumber Multiply(PyNumber o1, PyNumber o2);

    public static native PyNumber MatrixMultiply(PyNumber o1, PyNumber o2);

    public static native PyNumber FloorDivide(PyNumber o1, PyNumber o2);

    public static native PyNumber TrueDiv(PyNumber o1, PyNumber o2);

    public static native PyNumber Remainder(PyNumber o1, PyNumber o2);

    public static native PyNumber DivMod(PyNumber o1, PyNumber o2);

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