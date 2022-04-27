package me.lifeoncode;

public class App {

    public static void main( String[] args ) {
        House houseA = new House();
        houseA.info();

        House houseB = new House(155, 55);
        houseB.info();

        House houseC = new House(5, 15, 288, 88);
        houseC.info();
    }

}

