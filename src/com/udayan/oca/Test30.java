package com.udayan.oca;

public class Test30 extends B {
    public static void main(String[] args) {
        int y;
        A aTest = new A();
        B bTest = new B();

        y = aTest.a;
        y = bTest.a;

        y = aTest.b;
        y = bTest.b;

        y = A.b;
        y = B.b;

        System.out.println("sssssssssss");
    }
}


class B {
    static int a;
    int c=10;

    volatile int d=20;
    private int e=30;
    protected  int f=40;

    static {
         int b = 1;
    }

    public static void main(String[] args) {
        int t = B.b;
    }
}
