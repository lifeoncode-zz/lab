package me.lifeoncode;

public class LuxuryCar extends Car {
    public LuxuryCar(String manufacturer, String model, int year) {
        this("v12", manufacturer, year, 4, 4, model, 8, 260);
    }

    public LuxuryCar(String engine, String manufacturer, int year, int wheels, int doors, String model, int maxGear, int topSpeed) {
        super(engine, manufacturer, year, wheels, doors, model, maxGear, topSpeed);
    }
}
