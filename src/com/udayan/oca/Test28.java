package com.udayan.oca;

public class Test28 {
    public static void main(String[] args) {
        if (new Boolean("TrUe") == new Boolean(true)) {
            System.out.println("This is true");
        } else {
            if (new Boolean("TrUe")) {
                System.out.println("However, this is true");
                if(new Boolean(true)){
                    System.out.println("And this is true");
                }
            } else {
                System.out.println("This is false");
            }
        }
    }
}