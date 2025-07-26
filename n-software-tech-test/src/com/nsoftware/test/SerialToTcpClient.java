import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SerialToTcpClient {
    public static void main(String[] args) {
        String host = "localhost"; // Replace with public IP if over the internet
        int port = 9999;

        try (Socket socket = new Socket(host, port)) {
            System.out.println("[Client] Connected to server at " + host + ":" + port);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            System.out.println("[Client] Type lines to simulate serial data (Ctrl+C to exit):");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}