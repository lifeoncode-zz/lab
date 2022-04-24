package me.lifeoncode;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String salary = currency.format(64888);
        System.out.println(salary);
    }
}

