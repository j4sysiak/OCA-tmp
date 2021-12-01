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
        int s=manager.salary;
        manager.projektyManageraTopSecret();
        manager.displayC2();
        manager.displayI();
        manager.bhp();

        // byte <- (byte)short <- (short)int <- (int)long <- (long)float <- (float)double

        Short sh = new Short((short) 100);
        Byte b =   sh.byteValue();

        // Manager <- (Manager)Employee <- (Employee)Object

        C2_Employee employee = new C1_Manager();

        manager = (C1_Manager) employee;
        s= manager.salary;

ssss

        System.out.println("sssssssssssssssss");
    }
}












