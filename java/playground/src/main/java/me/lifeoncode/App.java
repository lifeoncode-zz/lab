package me.lifeoncode;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main( String[] args ) {
        Bank jake = new Bank("Jake Tran", "jake@jaketran.io", "0728234256");
        jake.deposit(450);
        jake.withdraw(100);
        jake.deposit(50);
        System.out.println(jake.getBalance());
    }

}

