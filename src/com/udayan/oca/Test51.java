package com.udayan.oca;

public class Test51 {
    public static void main(String[] args) {
        Test51 a = new Test51();
        int b = a.value; //(1)
        int c = AClass.value; //(2)
        int d = value, //(3)
        e = a.value - 5 ; //(4)
    }
}