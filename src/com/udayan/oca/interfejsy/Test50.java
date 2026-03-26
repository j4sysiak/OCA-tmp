package com.udayan.oca.interfejsy;

import java.util.ArrayList;
import java.util.List;

public class Test50 {

    public static void main(String[] args) {
        List<Mammal> mammals = new ArrayList<>();
        Animal animal = new Husky();
    //    mammals.add(animal);  'add(com.udayan.oca.Mammal)' in 'java.util.List' cannot be applied to '(com.udayan.oca.Animal)'
        System.out.println(mammals.get(0));
    }
}

abstract class Animal2  {
    @Override
    public String toString() {
        return "I am an animal";
    }
}

interface Mammal2 {

}

class Dog2 extends Animal implements Mammal{
    @Override
    public String toString() {
        return "Woof Woof";
    }
}

class Husky2 extends Dog{
    @Override
    public String toString() {
        return "Woof! I am a husky!";
    }
}
