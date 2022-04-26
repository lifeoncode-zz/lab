package me.lifeoncode;

public class Snake extends Animal {
    public Snake(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
    }

    @Override
    public void eat() {
        System.out.println("Gobbling...");
    }
}
