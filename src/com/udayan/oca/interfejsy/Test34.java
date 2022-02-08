package com.udayan.oca.interfejsy;


import com.udayan.oca.modyfikatory_dostepu.B;

public class Test34 {
    public static void main(String[] args) {
        A2[] a = new A2[0];
        B2 b = new C2();
     //   C2 c = new ICustom();  'ICustom' is abstract; cannot be instantiated

        A2 aa = new A2();
     //   ICustom d = (ICustom) aa;  //RUNTIME: com.udayan.oca.interfejsy.A cannot be cast to com.udayan.oca.interfejsy.ICustom
    }
}

interface ICustom {}
class A2 {}
class B2 extends A2 implements ICustom {}
class C2 extends B2{}