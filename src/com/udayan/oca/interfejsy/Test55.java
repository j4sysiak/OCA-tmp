package com.udayan.oca.interfejsy;

class  Test55 extends B {
    public static void main(String[] args) {
        AI a = new Test55();
        AI.m1();  // bo static
        a.m2();
    }

    @Override
    public void m2() {
        System.out.println("C");
    }

    @Override
    public void d2() {}
}

abstract class B implements AI {
   //public abstract void m1();

    public B() {
        System.out.println("B");
    }
}

interface AI {
//    default void d1();  // ERROR
    abstract void d2();
//    final void d1();    // ERROR
//    static void d1();   // ERROR
//    private void d1();  // ERROR

    static void m1(){
        System.out.println("AI");
    }

    default void m2(){
        System.out.println("AI");
    }
}