package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

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

//        ArrayList<String> list1 = new ArrayList<>();  // pełny obiekt ArrayList
//        list1.[dużo metod z ArrayList]
//
//        List<String> list = new ArrayList<>();  //niepełny obiekt ArrayList
//        list odpali tylko kilka metod, które są zdefiniowane w List lub Collection i są zaimplementowane w ArrayList
//        list.add();
//        list.remove();
//        list.removeIf();
//        list.equals();

//        List<String> list2 = new ArrayList();
//        AbstractList<String> aList = (AbstractList)list2;


        C2_Employee obj1 = new C1_Manager();  //niepełny obiekt Manager (zbudowany na fundamentach Employee)  (pokaże tylko w Manager metody @Override, a w Employee wszystkie metody)
     //   I obj2 = new C2_Employee();  //'C2_Employee' is abstract; cannot be instantiated
        I obj2 = new C1_Manager();  //niepełny obiekt Managera (zbudowany na fundamentach I) (pokaże tylko metody (z interfejsu I) zaimplementowane w Manager lub Employee )
        //int x=obj2.salary;   // XXXXXXX niewidoczny XXXXXX
        //obj2.projektyManageraTopSecret();  // XXXXXXX niewidoczny XXXXXX
        //obj2.displayC2(); // XXXXXXX niewidoczny XXXXXX
        obj2.displayI();    // dostępny w Employee, ponieważ Employee implements ten interface, a klasa Manager dziedziczy po Employee (a w klasie Manager nie ma tej metody)
        //obj2.bhp();       // XXXXXXX niewidoczny XXXXXX

        // C2_Employee s = obj2;  // Tylko w przypadku interfejsu: XXXXXXXXX Required type: C2_Employee  Provided: I  XXXXXXXXXXXXXX
        C2_Employee s = (C2_Employee)obj2;   //  s to będzie typowy niepełny obiekt Managera  (zbudowany z poziomu interface na fundamentach Employee)
        int x = s.salary;  // odpalany zawsze w Employee
        s.displayC2();     // odpalany w Employee, bo nie ma w @Override Manager
        s.displayI();      // odpalany w Employee, bo nie ma w @Override Manager
        s.bhp();           // odpalany w Manager bo jest @Override
        // s.projektyManageraTopSecret()  XXXXXXX niewidoczny - dostęp tylko dla pełnego objektu Manager XXXXXX


        I t = obj1;  // t -obiekt interfejsu I (widoczne tylko metody zaimplentowane z interfejsu) - obj1 - niepełny Manager (zbudowany na fundamentach Employee)
        t.displayI();


        C1_Manager manager = new C1_Manager();  //pełny Manager: odpala wszystko z Employee, jeżeli nie ma @Override u siebie, a jeżeli ma @Overriden to je odpala u siebie
        x=manager.salary;    // odpalany zawsze w Manager
        manager.projektyManageraTopSecret();  // odpalany w Manager bo nie ma w Employee
        manager.displayC2(); // odpalany z Employee bo nie ma w Manager
        manager.displayI();  // odpalany z Employee bo nie ma w Manager
        manager.bhp();       // odpalany z Manager bo jest @Override


        C2_Employee emplManag = new C1_Manager(); // niepełny Manager (na fundamentach Employee), nie odpali metody w klasie Manager jeżeli metoda nie jest @override
        x=emplManag.salary;    // odpalany zawsze w Employee
        emplManag.displayI();  // odpalany w Employee bo nie jest @Override w Manager
        emplManag.displayC2(); // odpalany w Employee bo nie jest @Override w Manager
        emplManag.bhp();       // odpalany w Manager bo jest @Override
       // emplManag.projektyManageraTopSecret()  XXXXXXX niewidoczny - dostęp tylko dla pełnego Managera XXXXXX


        // byte <- (byte)short <- (short)int <- (int)long <- (long)float <- (float)double
        // Manager <- (Manager)Employee <- (Employee)Object
        manager = (C1_Manager) emplManag;   //obiekt Manager: jest nadal pełnym obiektem Manager
        x=manager.salary;     // tak jak zwykły manager - nic się nie zmienia
        manager.projektyManageraTopSecret();  // tak jak zwykły manager - nic się nie zmienia
        manager.displayC2();  // tak jak zwykły manager - nic się nie zmienia
        manager.displayI();   // tak jak zwykły manager - nic się nie zmienia
        manager.bhp();        // tak jak zwykły manager - nic się nie zmienia

        System.out.println("sssssssssssssssss");
    }
}












