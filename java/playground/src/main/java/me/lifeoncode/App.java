package me.lifeoncode;

class Calculator {
    public static void add(int x, int y) {
        System.out.printf("%s + %s = %s\n", x, y, (x+y));
    }

    public void subtract(int x, int y) {
        System.out.printf("%s - %s = %s\n", x, y, (x-y));
    }
}

public class App {

    public static void main( String[] args ) {
        Calculator.add(4, 8);
        Calculator calculator = new Calculator();
        calculator.subtract(10, 4);
    }

}

