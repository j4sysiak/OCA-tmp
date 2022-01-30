package com.udayan.oca;

public class Test31 {
    public static void main(String[] args) {
        Object a, b, c;

        a = new String("Alpha");
        b = new String("Beta");
        c = "";
        c = b = a = c;
        System.out.println("" + c);
    }
}