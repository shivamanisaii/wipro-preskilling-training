package com.wipro.Day_seven;

public class GenericEx {
    public static void main(String[] args) {
        Mathops<Integer> intOp = new Mathops<>();
        System.out.println(intOp.sqr(5));
        System.out.println(intOp.multiply(4, 5));

    }
}

class Mathops<T extends Number> {

    public double sqr(T x) {
        return x.intValue()* x.intValue();
    }

    public double multiply(T x, T y) {
        return x.intValue() * y.intValue();
    }
}