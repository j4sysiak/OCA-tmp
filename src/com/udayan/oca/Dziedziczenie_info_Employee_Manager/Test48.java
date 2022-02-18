package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

class A5 {
    int a =1;
    int a1=11;
    int a2=111;
    int a3=1111;

    void gen(){
        System.out.println("A");
    }

    void metA1(){}
    void metA2(){}
    void metA3(){}
    void metA4(){}
}
class B5 extends A5 {
    int a = 20;
    int b1=22;
    int b2=222;
    int b3=2222;

    @Override
    void gen(){
        System.out.println("B");
    }

    void metB1(){}
    void metB2(){}
    void metB3(){}
    void metB4(){}
}

public class Test48 {
    public static void main(String[] args) {
        A5 a1 = new A5();
        B5 b = new B5();
        System.out.println(b.a);
      //  b = (B) a1;  Exception in thread "main" java.lang.ClassCastException:


        A5 a2 = new B5(); // niepełny B
        a2.gen();

        b = (B5) a2;   // B b = new B();  pełny B
        System.out.println(b.a);
        b.gen();

        System.out.println("sssssssssssss");
    }
}

