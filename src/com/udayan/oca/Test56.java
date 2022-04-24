package com.udayan.oca;


import com.udayan.oca.modyfikatory_dostepu.otherPackage.A;

import java.util.ArrayList;

public class Test56 {
    public static void main(String[] args) {
        Abstr aa = new Abstr() {};

        ArrayList<A> list = new ArrayList<>();

        list.add(new SubClass()); //1

        list.add(new Class()); //2


        list.add(new A() {}); //3

        B a = new Class();
     //   list.add(a);           //4
    }
}

abstract class Abstr {
}

interface B {
}

class Class extends A implements B {
}

class SubClass extends Class {
}