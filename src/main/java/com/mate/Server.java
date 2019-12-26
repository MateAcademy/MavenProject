package com.mate;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Sergey Klunniy
 */
public class Server {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(6666);
            Socket socket = serverSocket.accept();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ждем подключения и выводим");
            String result = bufferedReader.readLine();
            System.out.println(result);
            bufferedWriter.write(scanner.next());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
