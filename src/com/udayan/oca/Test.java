package com.udayan.oca;

class LogFileException extends RuntimeException {}
class AccessViolationException extends Exception {
}

public class Test  {

    public static void main (String[] args)  throws LogFileException {

        Test obj = new Test();

        obj.open();
        obj.process();

        System.out.println("sssssssssssssssss");
    }

    private void process() {
        System.out.println("process");
        throw new LogFileException();
    }

    private void open()   {
        System.out.println("open");
        try {
            throw new AccessViolationException();
        } catch (AccessViolationException e) {
            e.printStackTrace();
        }
    }

}
