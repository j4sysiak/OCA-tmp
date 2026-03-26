package com.udayan.oca.Conversions;

public class Test44 {
    public static void main(String[] args) {

        long i1 =  1000;
        long i2 =  1000;
        System.out.println(i1 == i2);  // true

        int I1 = new Integer(1000);
        int I2 = new Integer(1000);
        System.out.println(I1 == I2);  // true
        System.out.println(I1 == i1);  // true


        Integer a = 256;
        Integer b = 256;
        System.out.println(a == b);  // false

        Integer x = new Integer(256);
        Integer y = new Integer(256);
        System.out.println(x == y);  // false

        Byte c = a.byteValue();
        Byte d = b.byteValue();
        System.out.println(c == d);  // true

        Integer e = 127; //----> zachowuje się jak byte < 128
        Integer f = 127; //----> zachowuje się jak byte < 128
        System.out.println(e == f);  //true

        System.out.println("sssssssssssssss");
    }
}