package com.nsoftware.test;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpSerialReceiver {
    public static void main(String[] args) {
        int port = 9999;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Receiver waiting on port " + port + "...");

            Socket clientSocket = serverSocket.accept();
            InputStream input = clientSocket.getInputStream();

            byte[] buffer = new byte[1024];
            int bytesRead = input.read(buffer);
            String received = new String(buffer, 0, bytesRead);

            System.out.println("Message received: " + received);

        } catch (Exception e) {
            System.err.println("Error in TcpSerialReceiver: " + e.getMessage());
            e.printStackTrace();
        }
    }
}