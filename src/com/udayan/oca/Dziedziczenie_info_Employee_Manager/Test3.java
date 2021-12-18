package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

class Base {
    int base;

    void test() {
        System.out.println("base");
    }

    void base() {
        System.out.println("only in base");
    }
}

class Derived extends Base {
    int derived;

    @Override
    void test() {
        System.out.println("derived");
    }

    void derived() {
        System.out.println("only in derived");
    }
}


public class Test3 {

    public static void main(String args[]) {

        Base b1 = new Base();     // pełny Base  (pokaże wszystko tylko z Base)
        int v = b1.base;
        b1.base();
        b1.test();


        Base b2 = new Derived();  // niepełny Derived   (pokaże wszystko tylko z Base) - jednak metody Override (jeżeli takie są) odpali w Derived
        int b = b2.base;
        b2.test();
        b2.base();


        Derived d1 = new Derived();  //pełny Derived  (pokaże wszystko z Base i Derived) - metody Override (jeżeli takie są) odpali tylko w Derived
        int x = d1.base;
        int y = d1.derived;
        d1.base();
        d1.test();  // -----> poleci do Derived, bo tam jest dla tej metody @Override
        d1.derived();

        Derived d2 = new Derived();  // pełny Derived
   //   d2 = (Derived) b1; //Exception in thread "main" java.lang.ClassCastException
        d2 = (Derived) b2; //ok  !!! pomimo tego przypisania obiekt d2 jest nadal pełnym Derived   (nic tu się nie zmieni d2 będzie nadal d2)

        x = d2.base;
        y = d2.derived;
        d2.base();
        d2.test();
        d2.derived();

        Base b4 = new Base();  // pełny Base
        Derived d4 = new Derived(); // pełny Derived
        b4 = d4;  // (prawie) pełny Base - UWAGA: jedna rzecz się zmieni:  b4.test() wskoczy do @Override w Derived  (bo formalnie obiekt b4 wskazuje do Derived)

        int i =b4.base;
        b4.base();
        b4.test();  // -----> poleci do Derived, bo tam jest dla tej metody @Override


        System.out.println("ssssssssssssssssssssssss");
    }

}
