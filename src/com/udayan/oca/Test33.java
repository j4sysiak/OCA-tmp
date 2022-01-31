package com.udayan.oca;

public class Test33 {
    public static void main(String[] args) {
        long a = 12_00L;
        Integer b = null;
        try {
            b = Integer.parseInt(Long.toString(a));
            a = Long.parseLong(b.toString());
            System.out.println(a+b);
            throw new NullPointerException();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}