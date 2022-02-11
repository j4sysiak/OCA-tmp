package com.udayan.oca.kolejność_Uruchamiania;

class A {
    public A(String a) {
        System.out.print(a+" ");
    }
}

public class Test45 {

    static {
        System.out.println("wchodzę tu ...");
        int y = 0;
        System.out.println(y);
        Test45 e = new Test45("oo");
        d = new Test45("D");
    }



    static A a = new A("1");
    static  Test45 d;

    A e = new A("E");
    A b = new A("B");


    public static void main(String[] args) {
        Test45 c = new Test45("C");
    }

    public Test45(String a) {
        System.out.print(a +" ");
    }

}

//E B oo E B D 1 E B C

