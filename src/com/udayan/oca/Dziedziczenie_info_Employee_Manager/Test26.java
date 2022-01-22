package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

class AA {
    int i = 10;

}

class BB extends AA {
    int i = 20;
}

class CC extends BB {
    int i = 30;
}


public class Test26 {
    public static void main(String[] args) {
        AA a1 = new AA(); //pełny A
        System.out.println(a1.i);  //20
        System.out.println(((AA) a1).i); //10
//java.lang.ClassCastException        System.out.println(((B) a1).i);
//java.lang.ClassCastException        System.out.println(((C) a1).i);

        AA a2 = new BB(); //niepełny B
        System.out.println(a2.i);  //20
        System.out.println(((AA) a2).i); //10
        System.out.println(((BB) a2).i); //20
//java.lang.ClassCastException      System.out.println(((C) a2).i);


        AA a3 = new CC(); //niepełny C
        System.out.println(a3.i);  //20
        System.out.println(((AA) a3).i); //10
        System.out.println(((BB) a3).i); //20
        System.out.println(((CC) a3).i); //30

        BB b1 = new BB(); //pełny B
        System.out.println(b1.i);  //20
        System.out.println(((AA) b1).i); //10
        System.out.println(((BB) b1).i); //20
// java.lang.ClassCastException     System.out.println(((C) b1).i); //30

        BB b2 = new CC(); //niepełny C
        System.out.println(b2.i);  //20
        System.out.println(((AA) b2).i); //10
        System.out.println(((BB) b2).i); //20
        System.out.println(((CC) b2).i); //30

        CC c1 = new CC(); // pełny C
        System.out.println(c1.i);  //20
        System.out.println(((AA) c1).i); //10
        System.out.println(((BB) c1).i); //20
        System.out.println(((CC) c1).i); //30

        System.out.println("ssssssssssssss");
    }
}
