package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

class Bird {
    int x;
    public void fly() {
        System.out.println("Fly.");
    }
}

class Peacock extends Bird {
    int e;
    public void dance() {
        System.out.println("Dance.");
    }

}

public class Test6 {

    public static void main(String[] args) {

          //1
//        Bird b1 = new Peacock();  // niepełny Peacock  -  nie odpali dance()
//        Peacock p1 = new Peacock(); // p1 - pełny Peacock - odpali wszystko z Bird i Peacock
//        p1 = (Peacock) b1;  // p1 - pełny Peacock
//        p1.fly();
//        p1.dance();

        //2
        Peacock p2 = new Peacock();  // p2 - pełny Peacock
        Bird b2 = new Bird();        //b2 - pełny Bird
//      b2 = (Bird) new Peacock();  // b2 - niepełny Peacock
        b2 = (Bird) p2;       // p - niepełny Peacock - uwaga jeżeli byłaby metoda @Override w Peacock to tam poleci
        System.out.println(b2.x);
        //System.out.println(b2.e); // nie widzi z Peacock
        b2.fly();
        //b2.dance() // nie widzi z Peacock

        //3
        Bird p3 = new Peacock();  // p3 - niepełny Peacock    nie odpali dance()

        //4
        Bird b4 = new Bird();  // b4 - pełny Bird
        Peacock p4 = new Peacock();  //p4 - pełny Peacock
   //     p4 = (Peacock) b4;     // Exception in thread "main" java.lang.ClassCastException: com.udayan.oca.Bird cannot be cast to com.udayan.oca.Peacock
//      p4.fly();
//      p4.dance();

        System.out.println("ssssssssssssssssss");
    }


}
//Fly.Dance.