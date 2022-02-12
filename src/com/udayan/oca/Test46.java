package com.udayan.oca;

import java.util.ArrayList;
import java.util.List;

public class Test46 {

    public static void main(String... args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("1");
        for (String el : list) {
            if (el == "1") {
                list.remove("1");
            }
        }
        System.out.println(list);
    }
}




































