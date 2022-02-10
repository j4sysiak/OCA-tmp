package com.udayan.oca.Exceptions;

public class Test42 {
    static int j = 1;

    public static void main(String[] args) {
        try {
            throw ex(j);
        } catch (Error e) {
            System.out.println(j);
        }
    }

    static Error ex(int j) {
        j = 10;
        return new Error();
    }
}