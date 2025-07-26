import java.io.*;
import java.net.*;

public class TcpSerialReceiver {
    public static void main(String[] args) {
        int port = 9999;
        System.out.println("[Receiver] Waiting for connection on port " + port + "...");

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("[Receiver] Connected to client: " + clientSocket.getInetAddress());

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String line;

            while ((line = in.readLine()) != null) {
                System.out.println("[Receiver] Received: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}