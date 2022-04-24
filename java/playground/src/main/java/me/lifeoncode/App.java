package me.lifeoncode;

import java.util.Scanner;

public class App {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("enter something: ");
            String user = scanner.nextLine();
            if (user.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.println("you said: "+user);
        }

    }

}

