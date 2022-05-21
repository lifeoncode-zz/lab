package me.lifeoncode;

public class App {
    public static void main( String[] args ) {
        Dog dog = new Dog();
        dog.bark(5);
    }
}

class Dog {
    public void bark() {
        System.out.println("woof!");
    }

    public void bark(int number) {
        for(int i = 0; i < number; i++) {
            System.out.println("woof!");
        }
    }
}

