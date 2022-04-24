package me.lifeoncode;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        print(true, "enter salary: ");
        int income = scanner.nextInt();
        boolean hasHighIncome = income > 60_000;
        String message = hasHighIncome ? "Upper class" : "Middle class";
        print(false, message);
    }

    static void print(boolean sameLine, String text) {
        if (sameLine) {
            System.out.print(text);
        } else {
            System.out.println(text);
        }
    }
}

