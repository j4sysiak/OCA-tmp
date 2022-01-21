package com.udayan.oca;

public class Test17 {
    public static void main(String[] args) {
        char ch = 0; //pusty '\u0000'
        int i = '0'; //48
        ch += 'A';  // 0 + 65 = 75 --> (conversion from int to char) a 65 t 'A'
        System.out.println(i);  //48
        System.out.println(ch); //A
    }
}