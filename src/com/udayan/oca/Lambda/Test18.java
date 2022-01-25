package com.udayan.oca.Lambda;

interface Printer {
    void print(int abc);
}

public class Test18 {
    public static void main(String[] args) {

        Printer iprinter = new Printer() {
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
        metoda(new Printer() {
            @Override
            public void print(int a) {
                System.out.println("Hello World 333333333: " + a);
            }
        });


        System.out.println("FINISH");
    }

    public static void metoda(Printer ipr) {
        ipr.print(100);
    }
}

