package me.lifeoncode;

import org.w3c.dom.ls.LSOutput;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        int income = 120_000;
        String classLevel = (income > 60_000) ? "First" : "Economy";
        print(classLevel);
    }

    static void print(String text) {
        System.out.println(text);
    }
}

