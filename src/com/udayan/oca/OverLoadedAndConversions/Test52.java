package com.udayan.oca.OverLoadedAndConversions;

public class Test52 {

    //wywołanie 1
    public static String calc(byte a, double b){
        return "byte double";
    }

    //wywołanie 2
    public static String calc(float a, double b){
        return "float double";
    }

    //wywołanie 3
    public static String calc(int a, float b){
        return "int float";
    }

    public static void main(String[] args) {
        System.out.println(calc(2,2.0));  // arg1=2 - domyślnie int - nie może być coś mniejszego: byte, short - odpada
                                                //arg2=2.0 - domyślnie double - nie może być coś mniejszego:  byte, short. int. long, float
                                                // a więc:
                                                // wywołanie 1: odpada - bo pierwszym argumentem jest byte
                                                // wywołanie 2: może być:  arg1 większy od inta arg2 = double
                                                // wywołanie 3: odpada: chociaż arg1 - jest ok, ale arg2 - typu float odpada bo mniejszy niż double



    }
}