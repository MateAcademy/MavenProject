package Ava3;

import java.io.*;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("temp.txt")));
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine() );
        }

    }
}
