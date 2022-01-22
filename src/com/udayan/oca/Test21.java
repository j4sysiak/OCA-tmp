package com.udayan.oca;

interface I3 {
    public void met();
}

abstract class abstrAA implements I3 {
     public abstract void met();
}
class BB extends abstrAA {
    @Override
    public void met(){
        System.out.println("1");
    }
}
class CC extends abstrAA {
    @Override
    public void met(){
        System.out.println("2");
    }
}
class DD extends abstrAA {
    @Override
    public void met(){
        System.out.println("3");
    }
}
class EE extends abstrAA {
    @Override
    public void met(){
        System.out.println("4");
    }
}

public class Test21 {

    public static void main(String[] args) {
//        I3 aa = new abstrAA();  // nie można tworzyć instancji klasy abstrakcyjnej
        I3 bb = new BB();
        met(bb);

        bb = new CC();
        met(bb);

        bb = new DD();
        met(bb);

        bb = new EE();
        met(bb);
    }

    private static void met(I3 ii) {
        ii.met();
    }
}


