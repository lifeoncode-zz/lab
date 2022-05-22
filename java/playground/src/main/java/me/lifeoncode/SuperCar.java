package me.lifeoncode;

public class SuperCar extends Car {
    public SuperCar(String manufacturer, String model, int year) {
        this("v8", manufacturer, year, 4, 2, model, 7, 320);
    }

    public SuperCar(String engine, String manufacturer, int year, int wheels, int doors, String model, int maxGear, int topSpeed) {
        super(engine, manufacturer, year, wheels, doors, model, maxGear, topSpeed);
    }
}
