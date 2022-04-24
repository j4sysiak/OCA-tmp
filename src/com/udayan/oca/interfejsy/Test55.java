package com.udayan.oca.interfejsy;

class  Test55 extends B {
    public static void main(String[] args) {
        AI a = new Test55();
        AI.m1();  // bo static - idzie do metody orgyginalnej w AI
        a.m2();
    }

    @Override
    public void d2() {}
}

abstract class B implements AI {
      //public abstract void d2();
    //  public abstract void m1();
    //public abstract void m2();

      public static void m1() {
          System.out.println("m1 w B");
      }

    public void m2() {
        System.out.println("m2 w B");
    }

    public B() {
        System.out.println("B");
    }
}

interface AI {
//    default void d1();  // ERROR
      public abstract void d2();   //OK
//    final void d1();    // ERROR
//    static void d1();   // ERROR
//    private void d1();  // ERROR

    static void m1(){
        System.out.println("AI");
    }

    default void m2(){
        System.out.println("AI");
    }
}