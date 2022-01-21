package com.udayan.oca.interfejsy;


interface BasicVehicle{
    public static final  int  maxSpeed = 1;
    public void start();
}


public class Car implements BasicVehicle {

    private Car(){
        System.out.println(BasicVehicle.maxSpeed);
        System.out.println(maxSpeed);
       //ERROR maxSpeed = 120;
    }

    public void start() {
        System.out.println("Vroom start! MaxSpeed: " + BasicVehicle.maxSpeed);
    }

    public static void main(String[] args) {
        BasicVehicle car = new Car();
        car.start();
    }
}
