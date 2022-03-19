package com.udayan.oca;

import java.util.HashMap;
import java.util.Map;

public class Test52 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "First");
        map.put(2, "Second");
        map.put(3, "Third");
        map.put(4, "Java");
        for (String a: map) {
            if(a.length()<=5){
                System.out.println(a);
            }
        }
    }
}