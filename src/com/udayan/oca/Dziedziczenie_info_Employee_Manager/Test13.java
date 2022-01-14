package com.udayan.oca.Dziedziczenie_info_Employee_Manager;

import java.util.ArrayList;

public class Test13 {

    public static void main(String[] args) {

        ArrayList myList = new ArrayList();
        String myArray;

        try {
            while (true) {
                myList.add("My String");
            }
        }catch(RuntimeException rte) {
            System.out.println("RuntimeException");
        } catch (Exception e ) {
            System.out.println("Exception");
        }
        System.out.println("ssssssssssssssssssssssssssssss");

    }
}





















