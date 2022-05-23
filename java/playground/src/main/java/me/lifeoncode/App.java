package me.lifeoncode;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Dimensions dimensions = new Dimensions(40, 78, 22);
        Case theCase = new Case("44T", "Dell", "58W", dimensions);
        Motherboard board = new Motherboard("77PL", "Dell", 6, 3);
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("7T6", "Alienware", 32, resolution);

        Machine machine = new Machine(theCase, board, monitor);
        machine.getMotherboard().loadProgram("Game utils");
        machine.getMonitor().displayProgram("Ghost Recon");
    }
}
