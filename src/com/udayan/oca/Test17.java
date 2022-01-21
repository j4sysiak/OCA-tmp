package com.udayan.oca;

public class Test17 {
    public static void main(String[] args) {
        int i = 0;
        boolean a = true;
        boolean b = false;
        if(a & checkOdd(++i)){
            if (a && checkOdd(i++)){
                if (b | checkOdd(i++)){
                    if(b || checkOdd(++i)){
                        System.out.println("everything has passed");
                    } else {
                        System.out.println("4");
                    }
                } else {
                    System.out.println("3");
                }
            } else {
                System.out.println("2");
            }
        } else {
            System.out.println("1");
        }
    }

    public static boolean checkOdd(int i){
        return (i % 2 == 1) ? true : false;
    }
}