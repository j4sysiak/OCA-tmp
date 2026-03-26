package com.udayan.oca.Exceptions;

public class Test36 {
    public static void main(String[] args) {
        try {
            getError();
        } catch (RuntimeException e) {
            System.out.println(e);
        } catch (Exception e ){
            System.out.println(e);
        } catch (Error e) {
            System.out.println(e);
        }
    }

    private static void getError() throws Exception {
        getError();    //Exception in thread "main" java.lang.StackOverflowError
        throw new RuntimeException();
    }
}
