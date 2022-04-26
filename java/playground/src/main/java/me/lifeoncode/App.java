package me.lifeoncode;

public class App {

    public static void main( String[] args ) {
        Animal animal = new Animal("animal", 1, 1, 5, 5);
        Dog dog = new Dog("Husky", 8, 20, 2, 4, 1, 20, "beige brown");
        Snake snake = new Snake("python", 1, 1, 7, 67);

        snake.eat();
        dog.eat();
    }

}

