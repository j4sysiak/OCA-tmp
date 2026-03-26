package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

interface Inf {
    default String getValue(){
        return "A";
    }
}

  class Test32 implements Inf {
    @Override
    public String getValue() {
        return "B";
    }

    void met(){}
}

class Base2 extends Test32 {
    @Override
    public String getValue() {
        return "C";
    }
    public static void main(String[] args) {
        Inf a = new Test32();  // a zupełnie niepełny Test32
        Base2 b =  new Base2();

        b = (Base2) a;  //Exception in thread "main" java.lang.ClassCastException
        System.out.println(b.getValue());
    }
}



