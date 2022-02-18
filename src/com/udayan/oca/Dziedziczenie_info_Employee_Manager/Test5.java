package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

class A {
    public void test(){
        System.out.println("AAAAAAAAAAAAAAAA");
    }

    void mmmA(){}
}

class B extends A5 {
  //  @Override
    public void test(){
        System.out.println("BBBBBBBBBBBBBBBBBB");
    }
}

class C extends A5 {
  //  @Override
    public void test(){
        System.out.println("CCCCCCCCCCCCCCCCCCC");
    }

    void mmmC(){}
}
public class Test5 {

    public static void main(String ... s) {
        A5 b1 = new A5();   // pełny A
    //    b1.test(); // AAAAAA
        A5 b2 = new C();   // niepełny C
    //    b2.test(); // CCCCCC
        A5 b3 = new B5();   // niepełny B

        boolean x = b2 instanceof B5;  //false

        // b3 = (B)b2;  com.udayan.oca.Dziedziczenie_info_Employee_Manager.C cannot be cast to com.udayan.oca.Dziedziczenie_info_Employee_Manager.B

        b2 = b1; // b2 - staje się  pełnym A
    //    b2.test();  //AAAAAAAAAAAAA
     //   b2.mmmA();

        b1 = b2;   // b1 - staje się niepełnym C, vzyli odpali wszystkie  metody z A oraz @Override z C
    //    b1.test();  //CCCCCCCCCCC
   //     b1.mmmA();

        System.out.println("ssssssssssssssssssssss");
    }

}
