package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

class Aa {
    int A;
    String message(){
        return "A";
    }
    void metA(){}
}

class Bb extends Aa {
    int B;
    @Override
    String message(){
        return super.message()+" B";
    }
    void metB(){}
}

class Cc extends Bb {
    int C;
    @Override
    String message(){
        return super.message() + " C10";
    }
    void metC(){}
}

public class Test29 {
    public static void main(String args[]) {
        Aa b = new Bb(); //niepełny B
        int y = b.A;
//        y = b.B;
        System.out.println(b.message());

        Bb c = new Cc(); // niepełny C - wszystko z A i B orza Override z C  (nie pokaże int C)
        y = c.A;
        y = c.B;
//      y = c.C;
        System.out.println(c.message());
    }
}

