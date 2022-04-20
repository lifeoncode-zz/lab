package me.lifeoncode;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        // build server
        try(ServerSocket serverSocket = new ServerSocket(3000)) {
            System.out.println("server running...");
            // keep server open and listening for connections
            while(true) {
                // run thread for each connection
                Socket socket = serverSocket.accept();
                ServerThread serverThread = new ServerThread(socket);
                serverThread.start();
            }

        } catch (IOException err) {
            System.out.printf("server error: %s", err);
        }
    }
}
