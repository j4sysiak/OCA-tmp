package com.udayan.oca.Exceptions;

import java.io.IOException;

public class Test38 {
    public static void main(String[] args) {
        try {
            Car car = new Car(10);
        } catch (RuntimeException re) {
            System.out.println("Runtime");
        } catch (IOException e) {
            System.out.println("IOException");
        }
//        catch (ArithmeticException ex){
//            System.out.println("Arithmetic");
//        }
    }
}

class Car {
    public Car(int speed) throws IOException {
        if ((speed/0.0) > 50) {
            throw new IOException();
        }
        throw new RuntimeException();
    }
}