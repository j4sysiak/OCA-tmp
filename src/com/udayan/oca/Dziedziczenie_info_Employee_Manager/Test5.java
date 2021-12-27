package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

class A {
    public void test(){
        System.out.println("AAAAAAAAAAAAAAAA");
    }

    void mmmA(){}
}

class B extends A {
    @Override
    public void test(){
        System.out.println("BBBBBBBBBBBBBBBBBB");
    }
}

class C extends A {
    @Override
    public void test(){
        System.out.println("CCCCCCCCCCCCCCCCCCC");
    }

    void mmmC(){}
}
public class Test5 {

    public static void main(String ... s) {
        A b1 = new A();   // pełny A
        b1.test(); // AAAAAA
        A b2 = new C();   // niepełny C
        b2.test(); // CCCCCC
        A b3 = new B();   // niepełny B

        boolean x = b2 instanceof  B;  //false

        // b3 = (B)b2;  com.udayan.oca.Dziedziczenie_info_Employee_Manager.C cannot be cast to com.udayan.oca.Dziedziczenie_info_Employee_Manager.B

        b2 = b1; // b2 - staje się  pełnym A
        b2.test();  //AAAAAAAAAAAAA
        b2.mmmA();

        b1 = b2;   // b1 - staje się niepełnym C, vzyli odpali wszystkie  metody z A oraz @Override z C
        b1.test();  //CCCCCCCCCCC
        b1.mmmA();

        System.out.println("ssssssssssssssssssssss");
    }

}
