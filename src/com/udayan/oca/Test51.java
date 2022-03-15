package com.udayan.oca;

abstract class Move{
    abstract void moving();
}
public class Test51 extends Move {
    void moving() {
        System.out.println("moving...");
    }

    public static void main(String[] args) {
        Move obj = null;
        System.out.println("created...");
        obj.moving();  // Exception in thread "main" java.lang.NullPointerException
    }
}