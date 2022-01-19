package com.udayan.oca;

class A {
    String name = "A";

    String getName() {
        return name;
    }

}

class B extends A {
    String name = "B";

    @Override
    String getName() {
        return name;
    }

}

class C extends B {
    String name = "C10";

    @Override
    String getName() {
        return name;
    }
}

public class Test15 {
    public static void main(String[] args) {
        A class1 = new C();
        B class2 = (B) class1;
        System.out.println(class1.name + " " + class2.getName());
    }
}
