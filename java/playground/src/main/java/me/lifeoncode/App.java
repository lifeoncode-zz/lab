package me.lifeoncode;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main( String[] args ) {
        Bank jake = new Bank("Jake Tran", "jake@jaketran.io", "0728234256");
        String phone = jake.getPhone();
        ArrayList <String> accountNum = new ArrayList<String>();
        Random random = new Random();

        for (int i = 0; i < phone.length(); i++) {
            String randomNum = String.format("%s", random.nextInt(10));
            accountNum.add(randomNum);
        }
        String account = "";
        for (String num: accountNum) {
            account += num;
        }

        System.out.println(account);
    }

}

