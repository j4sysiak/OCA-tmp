package com.udayan.oca.Lambda;

interface Printer {
    void print(int y);
}

public class Test18 {
    public static void main(String[] args) {
        Printer iprinter = new Printer() {
            @Override
            public void print(int z) {
                System.out.println("Hello World");
            }
        };

        //1
        metoda((int y) -> System.out.println("Hello World"));

        //2
        metoda(iprinter);

        //3
        metoda(new Printer() {
            @Override
            public void print(int s) {
                System.out.println("Hello World");
            }
        });
        System.out.println("ssssssssssss");
    }

    public static void metoda(Printer a) {
        a.print(1);
    }
}

