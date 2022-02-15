package com.udayan.oca;

public class Test47 extends A {

        static final int a = Integer.parseInt(null); //1

        public Test(String a) {
            super(); //2
            System.out.println(a);
        }

        public static void main(String[] args) {
            Testa = (Test) new A("A"); //3
            System.out.println(this.a); //4
        }
    }

    class A {
        public A() {
        }
    }