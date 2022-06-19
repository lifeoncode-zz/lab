package me.lifeoncode;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    static void writeFile(File file) {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("something in here.\nanother thing in here.");
            writer.close();
            System.out.println("wrote to file: "+file);
            readFile(file);

        } catch (IOException err) {
            System.out.println("an error occurred: "+err.getMessage());
        }
    }

    static void readFile(File file) {
        try{
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String content = reader.nextLine();
                System.out.println(content);
            }
            reader.close();

        } catch (IOException err) {
            System.out.println("an error occurred reading the file: "+err.getMessage());
        }
    }

    static void createUser(String username) {
        try {
            File file = new File(username+".txt");
            if (file.createNewFile()) {
                System.out.println("user created.");
            } else {
                System.out.printf("user: %s already exist.\n",username);
            }
//            writeFile(file);

        } catch (IOException err) {
            System.out.println("something went wrong: "+err.getMessage());
        }
    }
}
