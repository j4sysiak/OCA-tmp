package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

public class Test49   {
    public static void main(String[] args) {

        A6 a1 = new A6();

        //B6 b1 = new A6();  ERROR
        B6 b2 = new B6();
        B6 b3 = new C6();

        //C6 c1 = new A6();  ERROR
        //C6 c2 = new B6();  ERROR
        C6 c3 = new C6();

        A6 class1 = new C6();

        System.out.println(class1.name);
        System.out.println(class1.getName());

        B6 b = (B6) new A6();
        b = (B6) new C6();

        System.out.println(b.name);
        System.out.println(b.getName());

    }
}

class A6 {
    String name = "A6";

    String getName() {
        return name;
    }

}

class B6 extends A6 {
    String name = "B5";

    String getName() {
        return name;
    }

}

class C6 extends B6 {
    String name = "C6";

    String getName() {
        return name;
    }
}

