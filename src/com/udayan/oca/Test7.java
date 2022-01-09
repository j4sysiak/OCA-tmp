package com.udayan.oca;

class Employee {
    public int salary;
}

class Manager extends Employee {
    public int budget;
}

class Director extends Manager {
    public int stockOpt;
}

public class Test {
    public static void main (String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
        Director d = new Director();

        d.stockOpt=1_000;
        e.budget=1;

        System.out.println("");
    }
}

