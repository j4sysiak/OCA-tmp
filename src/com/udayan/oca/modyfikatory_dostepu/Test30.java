package com.udayan.oca.modyfikatory_dostepu;

import com.udayan.oca.modyfikatory_dostepu.otherPackage.A;

public class Test30 extends A {
    public static void main(String[] args) {
        int y=0;
        A aTest = new A();  //other package
        B bTest = new B();  //same package

        //static.  (default modifier)
        //nie widzi          y = aTest.a;
        y = bTest.a;

        //default modifier
        //nie widzi          y = aTest.c;
        y = bTest.c;

        //volatile  (default modifier)
        //nie widzi         y = aTest.d;
        y = bTest.d;

        // {static int b=10}
//        y = aTest.b;
//        y = bTest.b;
//
//        y = A.b;
//        y = B.b;

        //private
//        y = aTest.e;
//        y = bTest.e;

        //protected
  //nie widzi      y = aTest.f;  // inny pakiet
        y = bTest.f;  // ten sam pakiet

        System.out.println("sssssssssss");
    }
}
