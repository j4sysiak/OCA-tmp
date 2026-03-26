package com.udayan.oca.Exceptions;

public class Test24 {
    public static void main(String[] args) {
        double[] a = new double[10];
        try{
            modifyArray(a);
        } catch (Exception e){
            System.out.println("Caught global exception");
        }
    }

    static void modifyArray(double[] a) throws Exception{
        try {
            a[10] = 5/0.0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("ArithmeticException AND ArrayIndexOutOfBoundsException");
        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ArrayIndexOutOfBoundsException");
//        }
    }
}
