package me.lifeoncode;

public class House {
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public House() {
        this(0, 0);
    }

    public House(int width, int height) {
        this(0, 0, width, height);
    }

    public House(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        System.out.println("\nConstructor chaining\n");
    }

    public void info() {
        System.out.println("__DETAILS__");
        System.out.printf("X: %s\nY: %s\nWidth: %s\nHeight: %s\n\n", x, y, width, height);
    }
}
