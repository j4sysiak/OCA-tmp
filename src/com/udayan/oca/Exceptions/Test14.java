package com.udayan.oca.Exceptions;

class A {
    public void hello() throws Exception {
        System.out.println("Hello I am class A");
    }
}

class B extends A {}

class C extends B{
    public void hello() throws Exception { // (2)
        System.out.println("Hello I am class C10");
    }
}

public class Test14  {
    public static void main(String[] args) throws Exception {
        B b = new C(); // (1)  // niepełne C
        boolean n1 = b instanceof A;  //true
        boolean n2 = b instanceof C;  //true
        b.hello();  // "Hello I am class C10"
    }
}


