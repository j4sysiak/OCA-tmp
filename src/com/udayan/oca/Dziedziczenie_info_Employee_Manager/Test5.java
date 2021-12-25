package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

class A {
    public void test(){
        System.out.println("AAAAAAAAAAAAAAAA");
    }
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

     //   b2 = b1; // b2 - pełny A
     //   b2.test();  //AAAAAAAAAAAAA

        b1 = b2;
        b1.test();  //CCCCCCCCCCC


        System.out.println("ssssssssssssssssssssss");
    }

}
