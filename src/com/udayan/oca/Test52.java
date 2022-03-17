package com.udayan.oca;

public class Test52 {
    public static void main(String[] args) {
        String question = "STR-.99";
        int answer = (int) Double.parseDouble(question.substring(3));
        switch (Math.abs(answer)) {
            case 0:
                System.out.print("Java ");
            case 1:
                System.out.print("Programming ");
                break;
            default:
                System.out.print("Secrets");
        }
    }
}
