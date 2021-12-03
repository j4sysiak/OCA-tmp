package com.udayan.oca;

interface I {
    public void displayI();
}

 abstract class C2_Employee implements I {
    int salary=2212;
    public void displayC2() {
        System.out.println("C2");
    }

      @Override
      public void displayI() {
          System.out.println("C2_Employee");
      }

      public void bhp(){
          System.out.println("bhp");
      }
}

class C1_Manager extends C2_Employee {
    int salary=100000000;
    public void projektyManageraTopSecret(){
        System.out.println("kldsajdlad3ldnllscxnlacx");
    }
    @Override
    public void bhp(){
        System.out.println("bhp dla managera");
    }

}

public class Test {

    public static void main(String ... args)  {

        C1_Manager manager = new C1_Manager();
        int s=manager.salary;   // odpalany zawsze w Manager
        manager.projektyManageraTopSecret();  // odpalany w Manager bo nie ma w Employee
        manager.displayC2(); // odpalany w Employee bo nie ma w Manager
        manager.displayI();  // odpalany w Employee bo nie ma w Manager
        manager.bhp();       // odpalany w Manager bo jest @Override

        // byte <- (byte)short <- (short)int <- (int)long <- (long)float <- (float)double
        // Manager <- (Manager)Employee <- (Employee)Object

        C2_Employee emplManag = new C1_Manager();
        s=emplManag.salary;  // odpalany zawsze w Employee
        emplManag.displayI();  // odpalany w Employee bo nie jest @Override w Manager
        emplManag.displayC2(); // odpalany w Employee bo nie jest @Override w Manager
        emplManag.bhp();  // odpalany w Manager bo jest @Override
       // emplManag.projektyManageraTopSecret()   niewidoczny - dostęp tylko dla manager

        manager = (C1_Manager) emplManag;
        s=manager.salary;
        manager.projektyManageraTopSecret();
        manager.displayC2();
        manager.displayI();
        manager.bhp();

        System.out.println("sssssssssssssssss");
    }
}












