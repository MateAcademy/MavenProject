package com.mate;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @author Sergey Klunniy
 */
public class Client {
    public static void main(String[] args) {

        try (Socket clientSocket = new Socket("localhost", 6666);
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))
          ) {
            bufferedWriter.write("Hello, I'm client");
            bufferedWriter.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
