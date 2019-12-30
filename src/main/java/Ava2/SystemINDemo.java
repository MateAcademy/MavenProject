package Ava2;

import java.io.IOException;

/**
 * @author Sergey Klunniy
 */
public class SystemINDemo {
    public static void main(String[] args) throws IOException {
        int x = System.in.read();
        char с = (char)x;
        System.out.println("Код символа: " + с + " = " + x);
    }
}
