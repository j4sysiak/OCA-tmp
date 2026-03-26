package com.udayan.oca.Exceptions;

public class Test43 {
    static int j = 1;

    public static void main(String[] args) {
        try {
     //  ERROR     throw ex(j);
        } catch (Error e) {
            System.out.println(j);
        }
    }

    static Exception ex(int j) {
        j = 10;
  //ERROR      return new Error();
        return new Exception();
    }
}