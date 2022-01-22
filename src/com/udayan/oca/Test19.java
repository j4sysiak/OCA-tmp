package com.udayan.oca;

interface G {}

public class Test19 implements G{
    Object a = new Test19 (); //1

    Boolean b = new Boolean(true); //2

    int c = 'a'; //3

//    Test19 d = new G(); //4  ERROR

    Float e = (float) 9; //5
}

