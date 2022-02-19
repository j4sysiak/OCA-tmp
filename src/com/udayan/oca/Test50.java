package com.udayan.oca;

class Shape {
    int x = 0;
    int y = 5;
}

class Square extends Shape {
    static int x = 20;
           int y = 0;


    public static void main(String[] args) {
        Shape shape = new Square();

        System.out.println(shape.x);
        System.out.println(x);

        System.out.println("sssssssss");

        Square square = (Square) shape;
    }

}

public class Test50 {

}