package com.udayan.oca.clothings.pants;

import com.udayan.oca.clothings.Shirt;

public class Jeans {

    public static void main(String[] args) {
        Jeans trouser = new Jeans();
        trouser.matchShirt();
    }

    public void matchShirt() {
        String color = Shirt.getColor();
        if (color.equals("Green")) {
            System.out.println("Fit");
        }
    }
}
