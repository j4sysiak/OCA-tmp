package com.udayan.oca.Lambda;

interface Result{
    int flag();
}

public class Test28 {
    public static void main(String[] args) {
        int x=10;
        int a = (int)6.6;

        met(() -> {return 100;});
        met(() -> 100);
        met(() -> a);
        met(() -> x);

        Result res = new Result() {
            @Override
            public int flag() {
                return a;
            }
        };
        met(res);

        met(new Result() {
            @Override
            public int flag() {
                return a+a+a;
            }
        });

        if(   met( () -> {return 100;})  ){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static boolean met(Result result) {
        return result.flag() > 5;
    }
}

