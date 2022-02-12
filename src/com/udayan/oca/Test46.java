package com.udayan.oca;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test46 {
    public static void main(String[] args) {
        double a = 5;
        boolean flag = a++ == 6 & --a == 5 || a++ ==5;
        System.out.println(a+ " " + flag);
    }
}
