package com.udayan.oca;


public class Test16 {
    public int price = 15;
    private static boolean sold;
    static final int CASH =100;


    static {
        sold = false;
    }

    public static void main(String[] args) {
        if(CASH > price && !sold){
            System.out.println("You have bought an apple");
        } else {
            System.out.println("All apples have been sold");
        }
    }
}