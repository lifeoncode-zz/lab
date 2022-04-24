package me.lifeoncode;

import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
        int[] numbers = {2, 55, 6, 11};
        Arrays.sort(numbers);
        System.out.printf("the numbers are: %s\n", Arrays.toString(numbers));
    }
}
