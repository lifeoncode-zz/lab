package me.lifeoncode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main( String[] args ) {
        try(Socket socket = new Socket("127.0.0.1", 3000)) {
            BufferedReader echoes = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
            );
            PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            String req;
            String res;

            // do while loop better for making sure client is prompted at leas once
            do {
                System.out.println("Enter something to display: ");
                req = scanner.nextLine();

                stringToEcho.println(req);
                if(!req.equalsIgnoreCase("exit")) {
                    res = echoes.readLine();
                    System.out.println(res);
                }
                
            }while(!req.equalsIgnoreCase("exit"));

            
        } catch (IOException e) {
            System.out.println("Client error: "+e.getMessage());
        }
    }
}
