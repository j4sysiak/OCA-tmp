package com.udayan.oca;

public class Test51 {
    public static void main(String[] args) {
        Order order = new Order(1);
        System.out.println("I want to order a "+ order);
    }
}

class Order {
    private String myOrder;

    Order(int x) {
        switch (x) {
            case 1:
                this.myOrder = "steak";
            case 2:
                this.myOrder = "pizza";
                break;
            default:
                this.myOrder = "salad";
        }
    }
}