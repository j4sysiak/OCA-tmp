package com.udayan.oca.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Customer {
    private String name;
    private int points;

    Customer(String  a, int b) {
        name=a;
        points=b;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public boolean hasOverHundredPoints() {
        return this.points > 100;
    }
}

public class Test {

    public static void main(String ... args) {

//        List<String> namesList = Arrays.asList("John", "Marry", "George", "Paul", "Alice", "Ann");
//
//        namesList
//                .stream()
//                .filter(e -> e.startsWith("A"))
//                .map(String::toUpperCase)
//                .sorted()
//                .forEach(System.out::println);



//        List<String> strings = Arrays.asList("a1", "a2", "b3", "b4", "c5", "c6");
//
//        strings
//                .stream()
//                .map(s -> s.substring(1))
//                .mapToInt(Integer::parseInt)
//                .average()
//                .ifPresent(System.out::println); // 3.5


        Customer john = new Customer("John P.", 15);
        Customer sarah = new Customer("Sarah M.", 200);
        Customer charles = new Customer("Charles B.", 150);
        Customer mary = new Customer("Mary T.", 1);

        List<Customer> customers = Arrays.asList(john, sarah, charles, mary);

//        List<Customer> customersWithMoreThan100Points = customers
//                .stream()
//                .filter(c -> c.getPoints() > 100)
//                .collect(Collectors.toList());
//
//        List<Customer> customersWithMoreThan100Points_2 = customers
//                .stream()
//                .filter(Customer::hasOverHundredPoints)
//                .collect(Collectors.toList());
//
//
//        List<Customer> charlesWithMoreThan100Points = customers
//                .stream()
//                .filter(c -> c.getPoints() > 100 && c.getName().startsWith("Charles"))
//                .collect(Collectors.toList());


//        String name = customers.stream()
//                /* .filter(c -> "Charles B.".equals(c.getName().startsWith("Charles"))) */
//                .map(Customer::getName)
//                .filter(c -> c.startsWith("Charles"))  //convert stream to String
//                .findAny()
//                .orElse("");



        List<String> list =   Arrays.asList("yearly", "years", "yeast", "yellow", "blues", "astra");

        List filteredList = list.stream()
                .filter(s -> s.length() == 5)
                .filter(s -> !s.startsWith("y"))
                .filter(s -> s.contains("str"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filteredList);


        System.out.println("sssssssssssssssssssssss");
    }
}
