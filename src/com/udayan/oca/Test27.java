package com.udayan.oca;

public class Test27 {


    public static void main(String[] args) {

     int a=1;
    int b=a++;
    int c=a++;

    //a=3
    //b=1
    //c=2

        try {
            int i = 2;
            int arr[][][][] = new int[i][i++][i++][i++];  //[2][2][3][4]
            System.out.println("i = " + i);
            System.out.print(arr.length);  // 2
            System.out.print(arr[1].length);  //2
            System.out.print(arr[1][1].length);  //3
            System.out.print(arr[1][1][2].length); //4
        } catch (IndexOutOfBoundsException e ){
            System.out.println(e);
        }
    }
}