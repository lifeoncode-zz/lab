package me.lifeoncode;

import java.util.Scanner;

public class App {

    public static void main( String[] args ) {
        String[] items = {"milk", "juice", "coffee beans", "sugar", "mango"};
        for (String item: items) {
            System.out.println(item);
        }
        System.out.println("\nthen...\n");
        for (int i = items.length-1; i >= 0; i--) {
            System.out.println(items[i]);
        }
    }

}

