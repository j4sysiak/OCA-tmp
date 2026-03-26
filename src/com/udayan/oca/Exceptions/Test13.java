package com.udayan.oca.Exceptions;

public class Test13 {
    public static void main(String[] args)  {
        try {
            getAnError();
            System.out.println("1");
        } finally {
            System.out.println("2");
        }
        System.out.println("3");
    }

    private static void getAnError()  /*lub throw Exception   ale do sygnatury main trzeba będzie też dodać throw Exception*/ {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

