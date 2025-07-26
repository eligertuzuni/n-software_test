package com.nsoftware.test;

import java.io.OutputStream;
import java.net.Socket;

public class TcpSerialSender {
    public static void main(String[] args) {
        String server = "localhost";
        int port = 9999;
        String message = "Hello from TcpSerialSender";

        try (Socket socket = new Socket(server, port)) {
            OutputStream output = socket.getOutputStream();
            output.write(message.getBytes());
            output.flush();
            System.out.println("Message sent: " + message);
        } catch (Exception e) {
            System.err.println("Error in TcpSerialSender: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
