package com.udayan.oca;

class A {
    public A(String a) {
        System.out.print(a+" ");
    }
}

public class Test45 {
    static A a = new A("A");
    A b = new A("B");

    public static void main(String[] args) {
        Test45 c = new Test45("C");
    }
    static {
        Test45 d = new Test45("D");
    }
    A e = new A("E");

    public Test45(String a) {
        System.out.print(a +" ");
    }
}


