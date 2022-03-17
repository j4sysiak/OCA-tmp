package com.udayan.oca;

public class Test51 {
    public static void main(String[] args) {
        try {
            System.out.println(calcSub(5, 4));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static int calcSub(int a, int b) throws NegativeNumberException {
        if ( a - b < 0) {
            throw new NegativeNumberException();
        } else {
            return b / (a - 5);
        }
    }


}

class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("There result is negative");
    }
}