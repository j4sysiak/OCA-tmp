package com.udayan.oca.Lambda;

interface Resulta{
    int flag(int x);
}

public class Test53 {
    public static void main(String[] args) {
        int a = 100;
        Resulta re = (x) -> x+100;

        boolean b = metoda(re);

        System.out.println("sssssssssssss");
    }

    private static boolean metoda(Resulta result) {
        return result.flag(1) < 5;
    }
}

