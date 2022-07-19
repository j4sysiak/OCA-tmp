package com.udayan.oca.jvm;

public class Test {

    public static void main(String[] args) {

       final Person p =  Person.builder().id(1).name("Jacek").surname("Sysiak").build();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(11);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(p);
                }
            }
        });
        thread.setName(ThreadName.JVM_EXAMPLE);
        thread.start();

    }
}
