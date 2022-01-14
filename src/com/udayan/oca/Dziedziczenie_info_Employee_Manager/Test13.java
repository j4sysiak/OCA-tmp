package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

class X {
    int a;
    public void test() {
        System.out.println("X");
    }
    void met(){}
}

class Y extends X {
    int b;
    public void test() {
        System.out.println("Y");
    }
    void met2(){}
}

class Z extends X {
    int c;
    public void test() {
        System.out.println("Z");
    }
    void met3(){}

    public static void main (String[] args)  {

        X b1 = new X();  //b1 - pełny X
        b1.test();  // Wyświetli wszystko tylko z A

        X b2 = new Z();  //b2 - niepełny Z - odpali wszystko z X oraz tylko @Override z Z
        Z z = new Z();
//        b2.met3();  nie widzi

        b1 = (X) b2;    // niepełny Z - odpali wszystko z X oraz tylko @Override z Z
        // lub b1 = (X) new Z(); // niepełny Z - odpali wszystko z X oraz tylko @Override z Z
        b1.met();
        b1.test();

        X a = new Z();  // niepełny Z
        a.met();
        a.test();

        X b3a = new X();
         b3a = (Y) b2;  // Exception in thread "main" java.lang.ClassCastException
     //   X b3b =  (Y) new Z();  // ERROR  nie można castować Y do X
//        b3.test();
//        System.out.println(b3.a);
//        b3.met();


        System.out.println();
    }
}






















