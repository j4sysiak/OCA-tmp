package com.udayan.oca;

public class Test56 {
    public static void main(String[] args) {

        A a1 = new A();
        ICustom i = new ICustom(){};  // innymi słowy  ICustom i = new B();
        // i = (B) a1;  // ERROR RunTimeException

        A a2 = new B();
        i = (ICustom) a2;  //OK

        A a3 = new C();  // niepełny C - odpali TYLKO wszystko z A oraz tylko metody @ z C
        a3.metoda();
        a3.metodaA();
        System.out.println(a3.a1);
        System.out.println(a3.a2);

    //    B b = new B();
    //    b = (B) a3;

        i = (ICustom) a3;   // innymi słowy  i = new B()     a3 = new C()  =>    b = (B) C  odpali wszystkie metody z B oraz metody @ z C
                                                                       // ale ponieważ i to interface więc odpali tylko metoddy @ z C
                                                                       // metoda z C musi być jednak skastowana: ((C) i).metoda();

        ((C) i).metoda();

        System.out.println("ssssssssssssss");
    }
}

interface ICustom {
}

class A {
    int a1=0;
    int a2=0;
    void metoda(){
        System.out.println("A");
    }

    void metodaA(){
        System.out.println("AA");
    }
}

class B extends A implements ICustom {
    int a1=2;
    int a2=2;
    void metoda() {
        System.out.println("B");
    }

    void metodaB() {
        System.out.println("BB");

    }
}

class C extends B {
    int a1=3;
    int a2=3;
    void metoda() {
        System.out.println("C");
    }

    void metodaC() {
        System.out.println("CC");

    }
}
