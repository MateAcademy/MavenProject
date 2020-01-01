package Ava3.ava;

import java.io.IOException;

/**
 * @author Sergey Klunniy
 */
public class Kitay {
    public static void main(String[] args) {
        int byteInt;
        try {
                while (true) {
                    byteInt = System.in.read();
                    System.out.println(byteInt);
                }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
