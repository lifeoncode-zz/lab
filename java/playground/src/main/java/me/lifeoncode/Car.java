package me.lifeoncode;

public class Car extends Vehicle {
    private String engineType;
    private boolean steeringWheel;
    private int numberOfWheels;
    private boolean reverse;
    private boolean engineRunning;
    private int speed;
    private int gear;

    public Car(String engineType, int numberOfWheels) {
        super(true);
        this.engineType = engineType;
        this.steeringWheel = true;
        this.numberOfWheels = numberOfWheels;
        this.reverse = false;
        this.engineRunning = false;
        this.speed = 0;
        this.gear = 0;
    }

    public void start() {
        if (engineRunning) {
            System.out.println("car engine's already running");
        } else {
            this.engineRunning = true;
            System.out.println("car engine running.");
        }
    }

    public void stop() {
        if (!engineRunning) {
            System.out.println("car engine is already off");
        } else {
            this.engineRunning = false;
            System.out.println("car engine turned off");
        }
    }

    public void accelerate(int speed) {
        if (engineRunning && this.gear > 0) {
            this.speed += speed;
            System.out.println("car accelerating...");
            System.out.println("now driving at "+this.speed);
        } else if (!engineRunning) {
            System.out.println("first start the engine.");
        } else {
            System.out.println("car at gear: "+gear+"\nshift up to start moving.");
        }
    }

    public void brake(int speed) {
        if (engineRunning && gear > 0 && (this.speed - speed) >= 0) {
            this.speed -= speed;
            System.out.println("car slowing down...");
            System.out.println("now driving at "+this.speed);

        }else if ((this.speed - speed) < 0) {
            this.speed = 0;
            System.out.println("car stopped");
        }
    }

    public void shiftUp() {
        this.gear += 1;
    }

    public void shiftDown() {
        if (gear == 0) {
            this.reverse = true;
        }else {
            this.gear -= 1;
        }
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getSpeed() {
        return speed;
    }
}
