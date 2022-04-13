package me.lifeoncode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main( String[] args ) {
        // build server
        try(ServerSocket serverSocket = new ServerSocket(3000)) {
            // keep server open with infinite loop
            while(true) {
                // open server socket
                // System.out.println("server running...");
                // listen for connection
                Socket socket = serverSocket.accept();
                System.out.println("client connected.");

                // read client data
                BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
                );
                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
                
                // read and out back client input
                String echo = input.readLine();
                if (echo.equalsIgnoreCase("exit")) {
                    break;
                }
                output.println("Server message: "+echo);
            }

            
        } catch (IOException e) {
            System.out.println("Server error: "+e.getMessage());
        }
    }
}
