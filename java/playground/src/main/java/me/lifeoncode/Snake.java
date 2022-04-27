package me.lifeoncode;

public class Snake extends Animal {
    public Snake(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
    }

    @Override
    public void eat() {
        System.out.println("Gobbling...");
    }

    @Override
    public void move(int speed) {
        System.out.println("snake moving at "+speed);
    }

    @Override
    public void greet(String name) {
        System.out.println("Snake say hello "+name);
    }

    public void slither() {
        System.out.println(this.getName()+" is slithering...");
        super.move(8);
    }
}
