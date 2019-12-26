package com.mate;

import java.io.*;
import java.net.Socket;

/**
 * @author Sergey Klunniy
 */
public class Client {
    public static void main(String[] args) {

        try (Socket clientSocket = new Socket("localhost", 6666);
//             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
             PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
          ) {
//            bufferedWriter.write("Hello, I'm Сергей Клунный" + "\n");
//            bufferedWriter.flush();
            printWriter.println("Hello, I'm Сергей Клунный\n");
//            printWriter.flush();

            System.out.println("Ответ от сервера");
            System.out.println(bufferedReader.read());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
