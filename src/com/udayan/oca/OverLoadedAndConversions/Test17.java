package com.udayan.oca.OverLoadedAndConversions;

public class Test17 {
/*
    double  --> Double.parseDouble(String);
    float   --> Float.parseFloat(String);
    long    --> Long.parseLong(String);
    int     --> Integer.parseInt(String);
    char    --> stringGoesHere.charAt(int position);
    short   --> Short.parseShort(String);
    byte    --> Byte.parseByte(String);
    boolean --> Boolean.parseBoolean(String);
*/

    private static String WriteName(String fullName){
        return fullName;
    }
//    private static char WriteName(String fullName1){
//        return fullName1;
//    }


   private static String WriteName(char f, String s) {
        return null;
    }

    private static String WriteName(char f, String s, String s1) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(WriteName("Rangel Stoilov"));
    }
}