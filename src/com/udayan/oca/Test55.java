package com.udayan.oca;

class  Test55 extends B {
    public static void main(String[] args) {
        A a = new Test55();
        a.m1();
    }

    @Override
    public void m1() {

    }
}

    class B implements A {


    public B() {
        System.out.println("B");
    }


        @Override
        public void m1() {

        }
    }

interface A {
      void m1();
//    {
//        System.out.println("A");
//    }
}