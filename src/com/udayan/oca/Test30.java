package com.udayan.oca;

import com.udayan.oca.otherPackage.A;

public class Test30  {
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



