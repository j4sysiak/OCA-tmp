package com.udayan.oca.Lambda;

interface Printer {
    void print(int abc);
}

public class Test18 {
    public static void main(String[] args) {

        Printer iprinter = new Printer() {
            @Override
            public void print(int a) {
                System.out.println("Hello World");
            }
        };

        //1
        metoda((int a) -> System.out.println("Hello World"));

        //2
        metoda(iprinter);

        //3
        metoda(new Printer() {
            @Override
            public void print(int a) {
                System.out.println("Hello World");
            }
        });
        System.out.println("ssssssssssss");
    }

    public static void metoda(Printer ipr) {
        ipr.print(1);
    }
}

