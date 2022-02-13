package com.udayan.oca;


import java.time.LocalDate;

public class Test46 {
    private static String message = "1234567890";
    private static String secret = "bbbbbbbbbbbbbbbbbb";

    public Test46(String message) {
        Test46.message = message;
    }

    static {
        secret = message.substring(4, 10);
    }

    public String decode() {
        return secret;
    }

    public static void main(String[] args) {
        Test46 a = new Test46("$32$SECRET*&3**");
        System.out.println(a.decode());
    }
}
































