package me.lifeoncode;

public class Lights {
    private boolean ON;

    public Lights() {
        this.ON = false;
    }

    public void on() {
        if (ON) {
            System.out.println("Lights already turned on.");
        }
        System.out.println("Turning on the Lights...");
    }

    public void off() {
        if (!ON) {
            System.out.println("Lights already turned off.");
        }
        System.out.println("Turning off the Lights...");
    }

    public boolean areOn() {
        return ON;
    }
}
