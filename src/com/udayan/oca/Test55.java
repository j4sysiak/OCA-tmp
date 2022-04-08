package com.udayan.oca;

public class Test55  {
    public static void main(String[] args) {
        try {
            System.out.println("12345".charAt(6));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array");
        } catch (IndexOutOfBoundsException e ){
            System.out.println("Index");
        } catch (StringIndexOutOfBoundsException e ){
            System.out.println("String");
        }
    }
}