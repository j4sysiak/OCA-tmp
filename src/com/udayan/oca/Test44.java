package com.udayan.oca;

import java.util.ArrayList;
import java.util.List;

public class Test44 {
    public static void main(String[] args) {
        int start = 1;
        int sum = 0;
        do {
            start++;
            if (start % 2 == 0) {
                sum += start;
            }
        } while (++sum <= 10);
        System.out.println(sum);
    }
}
