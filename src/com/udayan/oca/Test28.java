package com.udayan.oca;

interface Result{
    int flag();
}

public class Test28 {
    public static void main(String[] args) {
        int x=10;
        int a = (int)6.6;
        if(   met( () -> {return x;})  ){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static boolean met(Result result) {
        return result.flag() > 5;
    }
}

