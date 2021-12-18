package com.udayan.oca;

class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age) {
        setName(name);
        setAge(age);
        setSalary(2000);
    }

    public Employee(String name, int age, int salary) {
        this(name, age);
        setSalary(salary);
    }

    public Employee() {

    }

    private void setSalary(int i) {}
    private void setAge(int age) {}
    private void setName(String name) {}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void printDetails() {
        System.out.println(name +":"+ age +":"+ salary);
    }
}





public class Test {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Jack", 50);
        Employee e3 = new Employee("Chloe", 40, 5000);

        e1.printDetails();
        e2.printDetails();
        e3.printDetails();

        System.out.println("");
    }


}
