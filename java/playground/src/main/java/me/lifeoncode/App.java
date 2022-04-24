package me.lifeoncode;

import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
        int[][] numbers = new int[2][3];
        numbers[0][0] = 6;
        numbers[0][1] = 55;
        numbers[0][2] = 44;
        System.out.println(Arrays.toString(numbers[0]));
        numbers[1][0] = 9;
        numbers[1][1] = 41;
        numbers[1][2] = 67;
        System.out.println(Arrays.toString(numbers[1]));
    }
}
