package com.udayan.oca.interfejsy;

interface A {
    public static final int a1 = 1;
    public static final int a2 = 1;
    public static final int a3 = 1;
    public static final int a4 = 1;

    public default int met(){
        return 1;
    }

    public static int met(int y){
        return 11;
    }

    public void run(int speed);
}

public class Test27 implements A {
    static int a = 5;

    @Override
    public void run(int a) {
        this.met();
        A.met(1);
        this.run(1);
        int y = this.a1;
        int ye = this.a;
    }

    public static void main(String[] args) {
        Test27 test = new Test27();
        test.run(10);
    }
}