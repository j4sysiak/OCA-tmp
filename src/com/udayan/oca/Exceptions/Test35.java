package com.udayan.oca.Exceptions;

public class Test35 {
    public static void main(String[] args)  {
        try {
            getError();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void getError() throws Exception {
        getError();
    }
}