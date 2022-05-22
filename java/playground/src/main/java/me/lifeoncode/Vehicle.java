package me.lifeoncode;

public class Vehicle {
    private final String engine;
    private  final String manufacturer;
    private final int year;

    public Vehicle(String engine, String manufacturer, int year) {
        this.engine = engine;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public String getEngine() {
        return engine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }
}
