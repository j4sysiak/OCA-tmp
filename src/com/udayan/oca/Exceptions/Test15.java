package com.udayan.oca.Exceptions;


public class Test15 {
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e);
            throw new Exception();
        }
    }
}
