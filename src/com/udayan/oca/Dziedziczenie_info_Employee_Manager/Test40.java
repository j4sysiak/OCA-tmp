package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

class Vegetarian {
    String name;

    public Vegetarian() {
        System.out.println("");
    }

    public Vegetarian(String name) {
        this.name = "Vegetarian";
    }
}

class Vegan extends Vegetarian {
    String name = "Vegan";

    public Vegan() {
        super();
    }

    public Vegan(String name) {
        super(name);
    }
}

public class Test40 {
    public static void main(String[] args) {
        Vegetarian v1 = new Vegan();
        Vegetarian v2 = new Vegan("Vegan");
        System.out.println(v1.name + " " + v2.name);
    }
}



