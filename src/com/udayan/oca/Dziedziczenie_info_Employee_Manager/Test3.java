package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

class Base {
    int base;
    void test(){
        System.out.println("base");
    }
    void base(){
        System.out.println("only in base");
    }
}

class Derived extends Base {
    int derived;
    @Override
    void test(){
        System.out.println("derived");
    }
    void derived(){
        System.out.println("only in derived");
    }
}


public class Test3 {

    public static void main(String args[]) {

        Base b1 = new Base();   //pełny Base
        Base b2 = new Derived();  //niepełny Derived
        b2.test();

        Derived d1 = new Derived();  //pełny Derived  (pokaże wszystko z Base i Derived) - metody Override (jeżeli takie są) odpali w Derived
        Derived d2 = (Derived) new Base();


        System.out.println("ssssssssssssssssssssssss");
    }

}
