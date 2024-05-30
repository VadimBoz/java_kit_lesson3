package org.task1;

public class Calculator {
    public static  <T extends Number> Double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
    public static <T extends Number> Double staticmultiply(T a, T b) {
        return a.doubleValue()  * b.doubleValue();
    }
    public static <T extends Number> Double staticdivide(T a, T b) {
        if(Math.abs(b.doubleValue()) < 0.00001) {
            throw new ArithmeticException("Деление на ноль");
        }
        return a.doubleValue()  / b.doubleValue();
    }
    public static <T extends Number> Double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

}
