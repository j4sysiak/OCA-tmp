package com.udayan.oca;

public class Test55  {
    public static void main(String[] args) {

        A[] listA = new A[10];
        A a = new A();
        A b = new B();
        A c = new C();
        ICustom i = new B();

        listA[0] = a;
        listA[1] = b;
        listA[2] = c;

        B[] listaB = new B[10];
        listaB[0] = (B) i;

        System.out.println("ssssssssssss");

//        C c = new ICustom();
//        ICustom d = a;
    }
}

interface ICustom {}
class A {}
class B extends A implements ICustom {}
class C extends B{}