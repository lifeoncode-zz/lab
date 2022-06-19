package me.lifeoncode;

public class Lights {
    private boolean ON;

    public Lights() {
        this.ON = false;
    }

    public void on() {
        if (ON) {
            System.out.println("Lights already turned on.");
        } else {
            System.out.println("Turning on the Lights...");
            this.ON = true;
        }
    }

    public void off() {
        if (!ON) {
            System.out.println("Lights already turned off.");
        } else {
            System.out.println("Turning off the Lights...");
            this.ON = false;
        }
    }

    public boolean areOn() {
        return ON;
    }
}
