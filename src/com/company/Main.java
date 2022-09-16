package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
sqrt(8);

    }


    public interface UnaryOperator<T> {
        T apply(T t);
    }

   static void sqrt(int a) {
        UnaryOperator<Integer> square = x -> x*x;
        System.out.println(square.apply(a));
    }
}