package com.udayan.oca.volatile_examples;


//https://www.baeldung.com/java-volatile
public class TaskRunner {

    private static int number;
    private static boolean ready;

    private static class Reader extends Thread {

        @Override
        public void run() {
            while (!ready) {
                Thread.yield();

//                Many may expect this program to simply print 42 after a short delay.
//                However, in reality, the delay may be much longer. It may even hang forever, or even print zero!
//                The cause of these anomalies is the lack of proper memory visibility and reordering. Let's evaluate them in more detail.
                System.out.println("sssssssssssssssssss");
            }

            System.out.println(number); //the thread will simply print the number variable.
        }
    }

    public static void main(String[] args) {
        new Reader().start();  //creates another thread
        number = 42;
       // number += number;
        ready = true;
    }
}

//
//    To ensure that updates to variables propagate predictably to other threads, we should apply the volatile modifier to those variables:
//
//public class TaskRunner {
//
//    private volatile static int number;
//    private volatile static boolean ready;
//
//    // same as before
//}