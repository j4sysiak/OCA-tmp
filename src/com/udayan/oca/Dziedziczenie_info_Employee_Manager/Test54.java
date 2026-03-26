package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

public class Test54  {
    public static void main(String[] args) throws Exception {
        Car c = new Car();
        Fiat f = new Fiat();
        c = f;
       // Car c1 = new Fiat(); //niepełny Fiat - wszystko z Car i !tylko! metody @ z Fiat



        Vehicle v = new Fiat();
        f.drive();  //Fiat
        c.drive(); //Fiat
        v.drive();//Fiat
    }
}

class Fiat extends Car {
    public void drive() {
        System.out.println("Fiat driving...");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car driving...");
    }
}

class Vehicle {
    public void drive() throws Exception{
        System.out.println("Vehicle driving...");
    }
}