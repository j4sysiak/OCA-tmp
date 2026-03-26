package com.udayan.oca.Exceptions;

import java.io.IOException;

class X {
    public void printFileContent() throws IOException {
        /**/
        throw new IOException();
    }
}

public class Test12 {
    public static void main (String[] args) throws Exception {
        X xobj = new X();
        xobj.printFileContent();

        System.out.println("ssssssssssssssssssssssssssssssssssssssssssssssss");
    }
}
