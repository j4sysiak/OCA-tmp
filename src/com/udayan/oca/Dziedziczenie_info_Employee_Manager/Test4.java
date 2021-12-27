package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

interface Intf {
    public void displayI();
}

abstract class C2 implements Intf {
    public void displayC2() {
        System.out.println("C2");
    }

    public void displayC22222() {
        System.out.println("C22222");
    }

    public void displayI() {
        System.out.println("C2");
    }
}

class C1 extends C2 {
    @Override
    public void displayI() {
        System.out.println("C1");
    }

    public void mm() {
        System.out.println("ssssssss");
    }
}

public class Test4 {

    public static void main(String... args) {

        C2 obj1 = new C1();   // obj1 - niepełny C1 - odpali wszystko z C2 (Base) oraz  tylko metody @Override
        obj1.displayC22222();
        obj1.displayI();
        obj1.displayC2();

        Intf obj2 = new C1(); // obj2 - zupełnie niepełny C1 (zbudowany na interfejsie) - odpali tylko metody implementujące z interface Intf. Przykład z życia: List<String> list = new ArrayList();
        obj2.displayI();  //C1
        // obj2.displayC22222(); // neidostępne
        // obj2.mm();            // niedostępne


        Intf t = obj1;    // (tak jakbyśmy podstawili  new C1() za obj1)  --- t - zupełnie niepełny C1 (zbudowany na interfejsie) - odpali tylko metody @Override
        t.displayI();     //  C1
        // obj2.displayC22222(); // neidostępne
        // obj2.mm();            // niedostępne


        C2 s = new C1(); // s -  niepełny C1 - odpali wszystko z C2 (Base) oraz tylko metody @Override
        s = (C2) obj2;  // (tak jakbyśmy podstawili  new C1() za obj2, czyli s będzie niepełny C1 i basta - s - odpali wszystko z C2 (Base) oraz  tylko metody @Override
        s.displayC2();   //C2
        s.displayI();    // C1
        s.displayC22222(); // C22222

        System.out.println("sssssssssssssssss");
    }
}



















