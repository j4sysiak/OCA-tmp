package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

public class Test46 {
    public static void main(String[] args) {
        A4 a = new A4(42);
        A4 b = new B4("secret");
        System.out.println(a.getSecret());
        System.out.println(((B4) b).getSecret2());
    }
}

class A4 {
    int secret;

    public A4(int secret) {
        this.secret = secret;
    }

    public int getSecret() {
        return secret;
    }
}

class B4 extends A4 {
    String secret;

    public B4(String secret) {
        super(42);
        this.secret = secret;
    }

    public String getSecret2() {
        return secret;
    }
}































