package com.udayan.oca.Exceptions;

public class Test51 {
    public static void main(String[] args) {
        try {
            System.out.println(calcSub(5, 4));
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (RuntimeException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static int calcSub(int a, int b) throws NegativeNumberException2 {
        if (a - b < 0) {
            throw new NegativeNumberException2();
        } else {
            return b / (a - 5);
        }
    }


}

class NegativeNumberException2 extends Exception {
    public NegativeNumberException2() {
        super("There result is negative");
    }
}