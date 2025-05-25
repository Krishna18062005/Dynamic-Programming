// Exercise 35: TCP Client-Server Chat - Client
// This program connects to the server and allows the user to send messages.

import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        
        String userInput;
        System.out.println("Connected to chat server. Type messages:");
        while ((userInput = stdIn.readLine()) != null) {
            out.println(userInput);
            System.out.println("Server: " + in.readLine());
        }
        
        in.close();
        out.close();
        stdIn.close();
        socket.close();
    }
}