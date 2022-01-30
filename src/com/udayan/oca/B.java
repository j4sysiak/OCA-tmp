package com.udayan.oca;

public class B {
    static int a;

    int c = 10;  //default modifier
    volatile int d=20;
    private int e=30;
    protected  int f=40;

    static {
        int b = 1;
    }

    public static void main(String[] args) {

        // int y = B.b;
        // y = B.a;
    }
}