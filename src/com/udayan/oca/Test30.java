package com.udayan.oca;

public class Test30 extends B {
    public static void main(String[] args) {
        int y=0;
        A aTest = new A();
        B bTest = new B();

        //static v.
        y = aTest.a;
        y = bTest.a;

//        y = aTest.b;
//        y = bTest.b;
//
//        y = A.b;
//        y = B.b;

        //volatile
        y = aTest.d;
        y = bTest.d;

        //private
//        y = aTest.e;
//        y = bTest.e;

        //protected
        y = aTest.f;
        y = bTest.f;


        //default modifier
        y = aTest.c;
        y = bTest.c;

        System.out.println("sssssssssss");
    }
}


class B {
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
