package me.lifeoncode;

public class Tv {
    private int width;
    private int height;
    private boolean isOn;

    public Tv(int width, int height) {
        this.width = width;
        this.height = height;
        this.isOn = false;
    }

    public void on() {
        if (isOn) {
            System.out.println("TV already turned on.");
        } else {
            System.out.println("Turning on the TV...");
            this.isOn = true;
        }
    }

    public void off() {
        if (!isOn) {
            System.out.println("TV already turned off.");
        } else {
            System.out.println("Turning off the TV...");
            this.isOn = false;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isOn() {
        return isOn;
    }
}
