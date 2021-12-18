package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

class Employee {
    public int salary;

    public void test(){
        System.out.println("Employee");
    }
    public void test111(){
        System.out.println("Employee");
    }
    public void test22222(){
        System.out.println("Employee");
    }
}

class Manager extends Employee {
    public int budget;

    @Override
    public void test(){
        System.out.println("Manager");
    }
}

class SomeEmployeeMatters extends Employee {
    public String info;
    @Override
    public void test(){
        System.out.println("SomeEmployeeMatters");
    }

    public void generalInformation() {
        System.out.println("generalInformation from SomeEmployeeMatters");
    }
}

// Manager   -> Employee -> Object
// SomeEmployeeMatters -> Employee -> Object

public class Test2 {

    public static void main(String ... a){

        Employee b1 = new Employee();  //pełny Employee - pokaże wszystkie metody TYLKO z Employee
        int s = b1.salary;
        b1.test();
        b1.test111();
        b1.test111();



        SomeEmployeeMatters bs = new SomeEmployeeMatters(); //pełny SomeEmployeeMatters - pokaże wszystkie metody   z Employee i z SomeEmployeeMatters.
                                                            //jeżeli są metody Override w SomeEmployeeMatters to tylko te pokaże
                                                            //pokaże pola z Employee (salary) i z SomeEmployeeMatters (info)
        int t = bs.salary;
        String tt = bs.info;
        bs.test();
        bs.generalInformation();
        bs.test111();
        bs.test22222();


        Employee b2 = new SomeEmployeeMatters();  //niepełny SomeEmployeeMatters (pokaże tylko metody Override z Employee i wszystkie z Employee)
        int sa = b2.salary;
        b2.test();     //tylko metody override z Employee
        b2.test111();  //jeżeli nie jest Override to pokaże oryginała Employee
        b2.test22222(); ////jeżeli nie jest Override to pokaże oryginała Employee


        Employee b3 = new Employee();  //pełny Employee
        b3 =  b2;
        int e = b3.salary;
        //int e = b3.budget  // ERROR - nie pokaże
        b3.test();  // UWAGA !!!!  -  tutaj odpali metodę nadpisującą (Override) test()  w SomeEmployeeMatters
        b3.test111();
        b3.test111();


        b1 = (Employee) b2;
        b1.test();

        System.out.println("ssssssssssssssssssssssss");
    }

}
