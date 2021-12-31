package com.udayan.oca.Exceptions;

class LogFileException extends RuntimeException {
}

class AccessViolationException extends Exception {
}

public class Test12 {

    public static void main(String[] args) throws LogFileException {

        Test12 obj = new Test12();
        try {
            obj.open();
            obj.process();

        } catch (Exception e) {
            System.out.println("ddddddddddddddddd");
        }

        System.out.println("sssssssssssssssss");
    }

    private void open() throws AccessViolationException {
        System.out.println("open");
        throw new AccessViolationException();
    }

    private void process() {
        System.out.println("process");
        throw new LogFileException();
    }



}