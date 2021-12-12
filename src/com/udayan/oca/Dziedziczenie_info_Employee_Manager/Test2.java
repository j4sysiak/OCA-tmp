package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

class Employee {
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
    @Override
    public void test(){
        System.out.println("Manager");
    }
}

class SomeEmployeeMatters extends Employee {
    @Override
    public void test(){
        System.out.println("SomeEmployeeMatters");
    }
}

// Manager   -> Employee -> Object
// SomeEmployeeMatters -> Employee -> Object

public class Test2 {

    public static void main(String ... a){

        Employee b1 = new Employee();  //pełny Employee
//        b1.test();
        Employee b2 = new SomeEmployeeMatters();  //niepełny SomeEmployeeMatters
        b2.test();

        Employee b3 = new Employee();
        b3 =  b2;
        b3.test();

        b1 = (Employee) b2;
        b1.test();

        System.out.println("ssssssssssssssssssssssss");
    }

}
