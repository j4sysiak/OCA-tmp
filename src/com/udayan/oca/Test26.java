package com.udayan.oca;

public class Test26 {
    static void m2(){}
    static void m4(){}

    public static void main(String[] args) {
        Test26 _this = new Test26(); //5
        _this.caller(); //6
    }

    public void caller() {
        m2(); //1
        new Test26().m3(); //2
        this.m1(); //3
        this.m4(); //4
    }

    void m1(){
    }
    void m3(){
    }

}