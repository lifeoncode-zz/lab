package me.lifeoncode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// thread server so it's responsive to multiple clients
public class ServerThread extends Thread {
    private final Socket socket;
    // construct
    public ServerThread(Socket newSocket) {
        this.socket = newSocket;
    }

    // override Thread run method
    @Override
    public void run() {
        try {
            // process client input
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            // read and output client input back to client
            System.out.println("> client connected.");
            while(true) {
                String clientInput = input.readLine();
                System.out.printf("processing '%s'", clientInput);
                // if client inputs 'exit' - terminate connection by break loop
                if (clientInput.equalsIgnoreCase("exit")) {
                    break;
                }
                // output to client
                output.printf("server message: %s", clientInput);
            }

        } catch (IOException err) {
            System.out.printf("something went wrong: %s", err.getMessage());
        } finally {
            // close client socket
            try {
                socket.close();
            } catch (IOException err) {
                System.out.printf("could not close socket: %s", err.getMessage());
            }
        }
    }
}
