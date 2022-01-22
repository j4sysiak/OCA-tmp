package com.udayan.oca;

public class Test22 {
    public static void main(String[] args) {
        try {
            double n = 230 / 0.0;
        } catch (ArithmeticException e) {
            System.out.println("arithmetic");
        }
        catch (RuntimeException r) {
            System.out.println("runtime");
        }
    }
}