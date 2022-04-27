package me.lifeoncode;

public class App {

    public static void main( String[] args ) {
        Car car = new Car("v8", 4);
        car.start();
        car.shiftUp();
        car.accelerate(10);
        car.accelerate(20);
    }

}

