package me.lifeoncode;

class Calculator {
    private int num;
    private static int AB;

    public static void add(int x, int y) {
        System.out.printf("%s + %s = %s\n", x, y, (x+y));
        System.out.println(AB);
//        System.out.println(num);
//        subtract()
    }

    public void subtract(int x, int y) {
        System.out.printf("%s - %s = %s\n", x, y, (x-y));
        add(x, y);
        System.out.println(num);
        System.out.println(AB);
    }
}

public class App {

    public static void main( String[] args ) {
        Calculator calculator = new Calculator();
        calculator.subtract(10, 4);
    }

}

