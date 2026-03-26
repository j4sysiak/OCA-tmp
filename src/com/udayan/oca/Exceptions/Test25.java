package com.udayan.oca.Exceptions;

class CustomError {
    void m1(){
        throw new IllegalArgumentException();
    }
}

public class Test25 extends CustomError {
    public static void main(String[] args) {
        try{
            CustomError c = new CustomError();
            Test25 e = new Test25();
            e = (Test25) c;  //
            e.m1();
        } catch (IllegalArgumentException ex) {
            System.out.println("Illegal Argument");
        } catch (ClassCastException ex) {
            System.out.println("Class Cast Exception");
        }
    }
}

