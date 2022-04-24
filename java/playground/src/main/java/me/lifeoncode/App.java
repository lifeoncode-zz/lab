package me.lifeoncode;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        try {
            int num = Integer.parseInt(n);
            System.out.println("success");

        } catch (Exception err) {
            System.out.println("failed to convert: "+err.getMessage());
        }

        System.out.println("\nProgram ran to completion...");
    }
}
