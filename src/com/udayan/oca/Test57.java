package com.udayan.oca;

public class Test57 {

    public static void main(String[] args) {

        String s3 = "value1";
        String s2 = "value2";

        StringBuilder sb3 = new StringBuilder("value1");
        for (int i=0; i<100000; ++i) {
            sb3.append(s3);
        }

        System.out.println(sb3);
    }
}

