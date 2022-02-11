package com.udayan.oca;

class A {
    public A(String a) {
        System.out.print(a+" ");
    }
}

public class Test45 {
    static A a = new A("A");
    static  Test45 d;
    static {
         d = new Test45("D");
    }




    public static void main(String[] args) {
        Test45 c = new Test45("C");
    }

    public Test45(String a) {
        System.out.print(a +" ");
    }

    A e = new A("E");
    A b = new A("B");
}

//A B E D B E C
