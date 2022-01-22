package com.udayan.oca.Lambda;

interface Printer {
    void print();
}

public class Test18 {
    public static void main(String[] args) {
        /*INSERT CODE HERE*/
        Printer p = new Printer() {
            @Override
            public void print() {
                System.out.println("Hello World");
            }
        };

        //1
        print(() -> System.out.println("Hello World"));

        //2
        print(p);

        //3
        print(new Printer() {
            @Override
            public void print() {
                System.out.println("Hello World");
            }
        });


        System.out.println("ssssssssssss");

    }

    public static void print(Printer a) {
        a.print();
    }
}

