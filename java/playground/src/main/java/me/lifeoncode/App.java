package me.lifeoncode;

class Car {
    private String name;
    private String engine;
    private int wheels;
    private int topSpeed;

    public Car(String name, String engine, int topSpeed) {
        this.name = name;
        this.engine = engine;
        this.wheels = 4;
        this.topSpeed = topSpeed;
    }

    public void startCar() {
        System.out.println("Car -> started...");
    }

    public void stopCAr() {
        System.out.println("Car -> stopped...");
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}

class Porsche extends Car {
    public Porsche() {
        super("porsche 918", "v8", 345);

    }

    @Override
    public void startCar() {
        System.out.println(getName()+" -> started...");
    }
}


public class App {
    public static void main( String[] args ) {
        Car car = new Car("bmw", "straight 6", 300);
        Porsche porsche = new Porsche();
        car.startCar();
        porsche.startCar();
    }
}
