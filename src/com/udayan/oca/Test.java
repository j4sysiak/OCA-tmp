package com.udayan.oca;


class StockRoom {
    private static int stock=10;

    public void purchase(int qty) {
        stock= stock+qty;
    }

    public void sell(int qty) {
        stock= stock-qty;
    }

    public static void printStock(String action) {
        System.out.println(action +" : "+ qty + " : " + stock );
    }

}


public class Test {

    public static void main(String[] args) {

        StockRoom k1 = new StockRoom();
        k1.sell(5);
        k1.printStock("Sold");

        StockRoom k2 = new StockRoom();
        k2.purchase(5);
        k2.printStock("Purchased");

        System.out.println();
    }


}
