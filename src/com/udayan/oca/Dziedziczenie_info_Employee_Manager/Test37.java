package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

class A3 {
    public static void speak(){
        System.out.println("I am A3");
    }
}

class B3 extends A3 {
    public static void speak(){
        System.out.println("I am B3");
    }
}

class C3 extends B3 {
    public static void speak(){
        System.out.println("I am C3");
    }
}

public class Test37 {
    public static void main(String[] args) {
        get().speak();

    }

    public static A3 get(){
        return new C3();
    }
}

