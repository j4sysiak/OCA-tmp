package com.udayan.oca.interfejsy;

interface Rideable {
    public void ride(String a);
}

abstract class Animal {

//    public void ride(String a) {
//        System.out.println("in Animal");
//    }
}

class Horse extends Animal implements Rideable {

    public void ride(String a) {
        System.out.println("in Horse");
    }
}

public class Test2 {

    public  static  void main(String ... args) {
        Animal animHorse = new Horse();  //niepełny Horse
        ((Horse) animHorse).ride(null);

        System.out.println("ssssssssssssssss");
    }

}
