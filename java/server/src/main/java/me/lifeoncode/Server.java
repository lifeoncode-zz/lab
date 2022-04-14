package me.lifeoncode;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        // build server
        try(ServerSocket serverSocket = new ServerSocket(3000)) {
            System.out.println("server running...\n");
            // keep server open with infinite loop
            while(true) {
                // run thread on every connection
                Socket socket = serverSocket.accept();
                ServerThread serverThread = new ServerThread(socket);
                serverThread.start();
            }

        } catch (IOException e) {
            System.out.printf("Server error: %s\n",e.getMessage());
        }
    }
}
