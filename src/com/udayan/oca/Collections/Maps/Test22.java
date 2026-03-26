package com.udayan.oca.Collections.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test22 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "First");
        map.put(2, "Second");
        map.put(3, "Third");
        map.put(4, "Java");

        iterateUsingEntrySet(map);
        iterateUsingKeySetAndForeach(map);
        iterateValues(map);
        iterateUsingIteratorAndEntry(map);
        iterateUsingIteratorAndKeySet(map);
        iterateUsingIteratorAndValues(map);
        iterateUsingLambda(map);
        iterateByKeysUsingLambda(map);
    }

    public static void iterateUsingEntrySet(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> xxx : map.entrySet()) {
            System.out.println(xxx.getKey() + ":" + xxx.getValue());
        }
    }

    public static void iterateUsingKeySetAndForeach(Map<Integer, String> map) {
        for (Integer key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }

    public static void iterateValues(Map<Integer, String> map) {
        for (String value : map.values()) {
            System.out.println(value);
        }
    }

    public static void iterateUsingIteratorAndEntry(Map<Integer, String> map) {
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void iterateUsingIteratorAndKeySet(Map<Integer, String> map) {
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key + ":" + map.get(key));
        }
    }

    public static void iterateUsingIteratorAndValues(Map<Integer, String> map) {
        Iterator<String> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println("value :" + value);
        }
    }

    public static void iterateUsingLambda(Map<Integer, String> map) {
        map.forEach((k, v) -> System.out.println((k + ":" + v)));
    }

    public static void iterateByKeysUsingLambda(Map<Integer, String> map) {
        map.keySet().forEach(x -> System.out.println(x + ":" + map.get(x)));
        map.values().forEach(x -> System.out.println(x));
    }
}
