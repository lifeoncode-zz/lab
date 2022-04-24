package me.lifeoncode;

import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
        int x = 0;
        int y = x++;
        System.out.println(x);
        System.out.println(y);

        int w = 3;
        int z = ++w;
        System.out.println(w);
        System.out.println(z);
    }
}
