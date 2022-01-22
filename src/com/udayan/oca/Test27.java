package com.udayan.oca;

interface A {
    int a = 1;

    void run(int speed);
}

public class Test27 implements A {
    int a = 5;

    public void run(int a) {
        System.out.println("Running with " + this.a + " mph");
    }

    public static void main(String[] args) {
        Test27 test = new Test27();
        test.run(10);
    }
}