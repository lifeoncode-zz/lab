package me.lifeoncode;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        SuperCar porsche = new SuperCar("Porsche", "911", 2021);
        LuxuryCar rolls = new LuxuryCar("Rolls Royce", "Wraith", 2020);

        porsche.shiftUp();
        porsche.shiftUp();
        porsche.shiftUp();
        System.out.println(porsche.getGear());
        porsche.shiftDown();
        porsche.shiftDown();
        System.out.println(porsche.getGear());
    }
}
