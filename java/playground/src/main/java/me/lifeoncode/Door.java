package me.lifeoncode;

public class Door {
    private int height;
    private int width;
    private boolean isOpen;

    public Door(int height, int width) {
        this.height = height;
        this.width = width;
        this.isOpen = false;
    }

    public void open() {
        if (isOpen) {
            System.out.println("The door is already open.");
        } else {
            System.out.println("Opening door...");
            this.isOpen = true;
        }
    }

    public void close() {
        if (!isOpen) {
            System.out.println("The door is already closed.");
        } else {
            System.out.println("Closing door...");
            this.isOpen = false;
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
