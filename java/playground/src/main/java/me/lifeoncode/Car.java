package me.lifeoncode;

public class Car extends Vehicle {
    private final int wheels;
    private final int doors;
    private final String model;
    private int gear;
    private int maxGear;
    private int speed;
    private int topSpeed;

    public Car(String engine, String manufacturer, int year, int wheels, int doors, String model, int maxGear, int topSpeed) {
        super(engine, manufacturer, year);
        this.wheels = wheels;
        this.doors = doors;
        this.model = model;
        this.maxGear = maxGear;
        this.topSpeed = topSpeed;
    }

    public void accelerate(int speed) {
        if (gear <= 0) {
            System.out.println("You have to be at least on 1st gear.");
        } else if (this.speed == topSpeed) {
            System.out.println("Car moving at top speed: "+getSpeed());
        }
        setSpeed(speed);
    }

    public void shiftUp() {
        setGear(1);
    }

    public void shiftDown() {
        setGear(-1);
    }

    public void setGear(int gear) {
        if (this.gear == maxGear) {
            System.out.println("Car on final gear: "+getGear());
        }
        this.gear += gear;
    }

    public void setSpeed(int speed) {
        this.speed += speed;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public String getModel() {
        return model;
    }
}

