package me.lifeoncode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// thread server so that its responsive to multiple clients
public class ServerThread extends Thread {
    private Socket socket;
    
    // construct
    public ServerThread(Socket newSocket) {
        this.socket = newSocket;
    }

    // override Thread run method
    @Override
    public void run() {
        try {
            // process client input
            BufferedReader input = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
            );
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            
            // read and out back client input
            System.out.println("> client connected.");
            while(true) {
                String echo = input.readLine();
                System.out.println("processing: "+echo);
                if (echo.equalsIgnoreCase("exit")) {
                    break;
                }
                
                output.printf("Server message: %s\n",echo);
            }
            
            
        } catch (IOException e) {
            System.out.printf("Something went wrong: %s", e.getMessage());
            
        } finally {
            // try closing socket
            try {
                socket.close();
            } catch (IOException e) {
                System.out.printf("Couldn't close socket: %s", e.getMessage());
            }
        }
    }
}
