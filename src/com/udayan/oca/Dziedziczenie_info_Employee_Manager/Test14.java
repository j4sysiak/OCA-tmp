package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

class Shape {
    int aSide = 5;
    static int bSide = 10;
}

class Square extends Shape {
    static int aSide = 20;
    int bSide = 20; //aSide
}

public class Test14 {
    public static void main(String[] args) {
        Shape shape = new Shape();  // pełny Shape
        Square square = (Square) shape; //niepełny Shape  //ERRRRRROR  Exception in thread "main" java.lang.ClassCastException
        System.out.println(square.aSide + " " +square.bSide);
    }
}
