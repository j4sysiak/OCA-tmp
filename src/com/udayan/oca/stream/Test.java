package com.udayan.oca.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

    public static void main(String ... args) {


        List<String> namesList = Arrays.asList("John", "Marry", "George", "Paul", "Alice", "Ann");

        namesList
                .stream()
                .filter(e -> e.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


        List<String> strings = Arrays.asList("a1", "a2", "b3", "b4", "c5", "c6");

        strings
                .stream()
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println); // 3.5



        System.out.println("sssssssssssssssssssssss");
    }
}
