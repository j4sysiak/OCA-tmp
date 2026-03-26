package com.udayan.oca.interfejsy;

import java.util.ArrayList;
import java.util.List;

interface Mammal {}

abstract class Animal{
    @Override
    public String toString() {
        return "I am an animal";
    }
    void met(){}
}

class Dog extends Animal implements Mammal {
    @Override
    public String toString() {
        return "Woof Woof";
    }
}

class Husky extends Dog{
    @Override
    public String toString() {
        return "Woof! I am a husky!";
    }
}

public class Test20 {
    public static void main(String[] args) {
        List<Mammal> mammals = new ArrayList<>();
        Animal animal = new Husky();  //niepełny Husky
        animal.toString();

      //mammals.add( animal);   ERROR - animal nie jest typem Mammal
        mammals.add( (Mammal) animal);


        Dog d =new Dog();
        Dog d2 = new Husky();
        Husky h1 = new Husky();

        mammals.add(h1);
        System.out.println(mammals.get(0));
    }
}
























