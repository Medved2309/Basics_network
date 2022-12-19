package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {


    public static void main(String[] args) throws IOException {


        try (Socket Socket = new Socket(ServerConfig.HOST, ServerConfig.PORT);
             PrintWriter out = new PrintWriter(Socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(Socket.getInputStream()))) {
            out.println("Алексей");
            System.out.println(in.readLine());


        }
    }


}
