package com.udayan.oca.Exceptions;

import java.io.IOException;

public class Test31 {
    public static void main(String[] args) throws Exception {
        try {
            try {
                m1();
            } finally {
                m2();
            }
        } catch (IOException e) {
            System.out.println("caught");
        }
        catch (RuntimeException e) {
            System.out.println("caught");
        }
    }

    private static void m1() throws RuntimeException {
        System.out.print("1 ");
        throw new RuntimeException();
    }

    private static void m2() throws IOException {
        System.out.print("2 ");
        throw new IOException();
    }
}

