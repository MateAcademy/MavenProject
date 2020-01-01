package Ava3.ava;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Sergey Klunniy
 */
public class Kitay {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader;
        try {
                inputStreamReader = new InputStreamReader(System.in);
                int arr = inputStreamReader.read();
                    System.out.println((char)arr);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
