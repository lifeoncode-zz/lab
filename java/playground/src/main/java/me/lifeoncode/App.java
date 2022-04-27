package me.lifeoncode;

import java.text.NumberFormat;
import java.util.Currency;

class Car {
    private static String engineType;
    private int price;

    public Car(String engineType, int price) {
        Car.engineType = engineType;
        this.price = price;
    }

    public void info() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("a "+engineType+" car costs "+ currency.format(price));
    }
}


public class App {

    public static void main( String[] args ) {
        new Car("v12", 460_000).info();
    }

}

