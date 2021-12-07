package com.udayan.oca.interfejsy;

interface Rideable {
    public void ride(String a);
}

abstract class Animal {
//
//    public void ride(String a) {
//        System.out.println("in Animal");
//    }
}

class Horse extends Animal  {


    public void ride(String a) {
        System.out.println("in Horse");
    }


}

public class Test2 {

    public  static  void main(String ... args) {
        Animal animHorse = new Horse();  //niepełny Horse na fundamentach Animal
        animHorse.ride(null);  //animHorse będzie szukał metody ride u siebie (w klasie Horse) ale tylko takiej która jest @Override z Animal
                               //jeżeli nie będzie takiej, to odpali ride() z Animal
                  // jeżeli jednak chcemy w sposób jawny odpalić metodę ride() z Horse (która nie jest @Override) to musimy rzutować- wskazać , że konkretnie
                  // metodę ride() z Horse chcemy odpalić
        ((Horse) animHorse).ride(null);

        System.out.println("ssssssssssssssss");
    }

}
