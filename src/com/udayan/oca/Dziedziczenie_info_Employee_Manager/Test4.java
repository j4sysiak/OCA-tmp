package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

interface Int {
    public void displayI();
}

abstract class C2 implements Int {
    public void displayC2() {
        System.out.println("C2");
    }
}

class C1 extends C2 {

    @Override
    public void displayI() {
        System.out.println("C1");
    }
    public void mm(){
        System.out.println("ssssssss");
    }
}

public class Test4 {

    public static void main(String ... args)  {

        C2 obj1 = new C1();   // obj1 - niepełny C1 - odpali wszystko z C2 oraz  tylko metody @Override
        Int obj2 = new C1();    // obj2 - zupełnie niepełny C1 - odpali tylko metody @Override
        obj2.displayI();  //C1

        C2 s =  (C2) obj1;    // także niepełny C1 - odpali wszystko z C2 oraz  tylko metody @Override
        s.displayC2();  //C2
        s.displayI();  // C1

        Int t = obj1;    // t - zupełnie niepełny C1 - odpali tylko metody @Override
        t.displayI();  // C1

        System.out.println("sssssssssssssssss");
    }
}



















