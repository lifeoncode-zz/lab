package me.lifeoncode;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        print(true, "enter number: ");
        int num = scanner.nextInt();

        boolean three = (num % 3 == 0);
        boolean five = (num % 5 == 0);

        String message = (three && five) ? "FizzBuzz" : (five && !three) ? "Fizz" :
                (!five && three) ? "Buzz" : String.format("%s",num);
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

