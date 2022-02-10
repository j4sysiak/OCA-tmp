package com.udayan.oca.Exceptions;

import java.io.FileNotFoundException;

public class Test39 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        m2();
        m3();
        m4();
    }

    public static void m1() throws Exception {
    }

    public static void m2() throws RuntimeException {
    }

    public static void m3() throws ArithmeticException {
    }

    public static void m4()   {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

