package com.udayan.oca;

public class Test46 {
    public static void main(String  args) {

//        System.out.println(args);

        customMethod();
    }

    private static void customMethod(String... strings) {
        System.out.println("Object is: " + strings);
    }
}
