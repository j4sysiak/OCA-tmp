package com.udayan.oca.Conversions;

public class Test47 {
    public static void main(String[] args) {

        Object oF = new Float(7.5);  // niepełny Float - udostępni tylko metody @Override
    // ERROR     int i1 = oF.intValue();  // no i intValue() nie nie jest @Override w Float - to dlatego nie można jej użyć


        Float f = new Float(7.5); // pełny Float - udostępni wszystkie metody od siebie i z Object
        int i2 = f.intValue(); // success intValue() działa


        System.out.println("ssssssssssssss");
    }
}
