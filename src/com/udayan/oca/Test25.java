package com.udayan.oca;

public class Test25 {
    public static void main(String[] args) {
        try {
            double a = 0 / 0;
            if (a >= 0) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}