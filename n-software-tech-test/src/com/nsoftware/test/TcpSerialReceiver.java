package com.nsoftware.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//Java Server (Listens via TCP → Prints)
public class TcpSerialReceiver {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(12345);
        System.out.println("Listening...");

        Socket client = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println("Received: " + line);
        }

        in.close();
        client.close();
        server.close();
    }
}
