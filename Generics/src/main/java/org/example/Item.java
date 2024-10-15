package org.example;

public class Item {

    public static <T> void printItem(T data){
        System.out.println(data);
    }

    public static <T, U> void printItems(T data1, U data2){
        System.out.println(data1 +" : and "+data2);
    }
}
