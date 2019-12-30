package Ava;

import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

/**
 * @author Sergey Klunniy
 */
public class SystemIN3 {
    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        while (true) {
        int symbolIN = inputStreamReader.read();
            System.out.println(symbolIN);
            System.out.println((char)(symbolIN));
        }
    }
}

