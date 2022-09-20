package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(sqrt(9));

    }


    public interface UnaryOperator<T> {
        T apply(T t);
    }

    public static double sqrt(double input) {
        UnaryOperator<Double> unaryOp = num -> Math.sqrt(num);

        double result = unaryOp.apply(input);
        return result;
    }
}


