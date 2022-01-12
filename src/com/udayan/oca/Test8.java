package com.udayan.oca;


import com.udayan.oca.interfejsy.b.Test;

public class Test8 {
    int a1;

    public static void doProduct(int t) {
        t=t*t;
    }

    public static void doString(String w) {
        w.concat(" "+w);
    }
    public static void main (String[] args)  {

        Test item = new Test();
        item.a1=11;

        String sb = "Hello";
        Integer i = 10;

        doProduct(i);
        doString(sb);
        doProduct(item.a1);
        System.out.println(i +" "+ sb +""+ item.a1);

        System.out.println();
    }
}


