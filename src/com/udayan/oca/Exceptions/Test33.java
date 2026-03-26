package com.udayan.oca.Exceptions;

public class Test33 {
    private static int calc(int a) {
        int x = 9;
        try {
            if (6 % 2 == 0) throw new RuntimeException("Number is odd.");
            else return x % 9;
        } catch (Exception e) {
            if (a > (int) 6.5) return a % 5;
            else return 4;
        } finally {
            return 6;
        }
    }

    public static void main(String args[]) {
        System.out.println(calc(6));
    }
}