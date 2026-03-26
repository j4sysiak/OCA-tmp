package com.udayan.oca.Lambda;

interface Printer {
    void met();
}

public class Test41 {
    public static void main(String[] args) {
        /*INSERT CODE*/

        uuuu(   () -> System.out.println("WWWWWWWWWWWWWWWWWWWWW")    );
        uuuu(   () -> { System.out.println("WWWWWWWWWWWWWWWWWWWWW"); }    );
        uuuu(   () -> { System.out.println("WWWWWWWWWWWWWWWWWWWWW"); return; }    );

        //1
        Printer a1 = () -> System.out.println("1111111111111");
        a1.met();

        //2 ERROR
//        Printer a2 = () -> {return "2222222222222";};
//        a2.met();

        //3
        Printer a3 = new Printer() {
            @Override
            public void met() {
                System.out.println("3333333333333");
            }
        };
        a3.met();

        //4
        Printer a4 = () -> {  System.out.println("444444444444");  };
        a4.met();


    }

    public static void uuuu(Printer a) {
        a.met();
    }
}

