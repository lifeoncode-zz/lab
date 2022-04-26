package me.lifeoncode;

public class Animal {
    private final String name;
    private final int brain;
    private final int body;
    private final int size;
    private final int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("eating...");
    }

    public void move() {
        System.out.println("moving...");
    }

    public String getName() {
        return this.name;
    }

    public int getBrain() {
        return this.brain;
    }

    public int getBody() {
        return this.body;
    }

    public int getSize() {
        return this.size;
    }

    public int getWeight() {
        return this.weight;
    }
}
