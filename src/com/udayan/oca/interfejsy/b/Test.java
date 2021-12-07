package com.udayan.oca.interfejsy.b;

interface I {
    public static final int salePercentage = 85;

    public static String metStatic() {
        return salePercentage + "%";
    }

    public default String metDef() {
        return salePercentage + "%";
    }
}

class Book implements I {}

public class Test {

    public static void main(String[] args) {

        I[] iarr = new I[2];
        for (I i : iarr) {
            i.metDef();
            I.metStatic();
            int x = i.salePercentage;
            x = I.salePercentage;
        }

    }
}
