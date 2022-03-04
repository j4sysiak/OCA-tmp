package com.udayan.oca.Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test50 {
    public static void main(String[] args) {
        B5 b5 = new C5(); // (1)
        try {
            b5.hello();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class A5 {
    public void hello() throws  Exception {
        System.out.println("Hello I am class A5");
    }
}

class B5 extends A5 {

}

class C5 extends B5 {
    public   void hello() throws FileNotFoundException { // (2)
        System.out.println("Hello I am class C10");
        throw new FileNotFoundException();
    }
}