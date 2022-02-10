package com.udayan.oca.Lambda;

interface Printer2 {
    void print(int abc);
}

public class Test18 {
    public static void main(String[] args) {

        Printer2 iprinter = new Printer2() {
            @Override
            public void print(int a) {
                System.out.println("Hello World 11111111111: " + a);
            }
        };

        //1
        metoda(iprinter);

        //2
        metoda((int a) -> System.out.println("Hello World 2222222222222: " + a));
        metoda((a) -> System.out.println("Hello World 2222222222222: " + a));
        metoda(a -> System.out.println("Hello World 2222222222222: " + a));
        metoda(a -> System.out.println(a));

        //3
        metoda(new Printer2() {
            @Override
            public void print(int a) {
                System.out.println("Hello World 333333333: " + a);
            }
        });


        System.out.println("FINISH");
    }

    public static void metoda(Printer2 ipr) {
        ipr.print(100);
    }
}

