package com.udayan.oca.Exceptions;

class LogFileException extends Exception { }
class AccessViolationException extends RuntimeException { }

public class App {

    public static void main(String[] args) throws LogFileException {
        App obj = new App();
        try {
            obj.open();
            obj.process();
            //insert code here
        } catch (Exception e) {
            System.out.println("Completed");
        }
        System.out.println("sssssssssssssssss");
    }

    private void open()   {
        System.out.println("open");
        throw new AccessViolationException();
    }

    private void process()   {
        System.out.println("process");
        //throw new LogFileException();
    }
}