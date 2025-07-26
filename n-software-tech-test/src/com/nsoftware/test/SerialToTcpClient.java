import java.io.OutputStream;
import java.net.Socket;
import com.fazecast.jSerialComm.SerialPort;
package com.nsoftware.test;


// Java Client (Reads Serial → Sends via TCP)

public class SerialToTcpClient {


    public static void main(String[] args) throws Exception {
        // Open COM port
        SerialPort comPort = SerialPort.getCommPort("COM3"); // Change to actual port
        comPort.setBaudRate(9600);
        comPort.openPort();

        // Connect to server
        Socket socket = new Socket("SERVER_IP", 12345);
        OutputStream out = socket.getOutputStream();

        // Read and forward line by line
        StringBuilder buffer = new StringBuilder();
        while (true) {
            while (comPort.bytesAvailable() > 0) {
                byte[] readBuffer = new byte[1];
                comPort.readBytes(readBuffer, 1);
                char ch = (char) readBuffer[0];
                if (ch == '\n') {
                    String line = buffer.toString();
                    out.write((line + "\n").getBytes());
                    out.flush();
                    buffer.setLength(0);
                } else {
                    buffer.append(ch);
                }
            }
            Thread.sleep(10);
        }
    }
}
