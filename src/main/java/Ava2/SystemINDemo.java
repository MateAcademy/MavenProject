package Ava2;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Sergey Klunniy
 */
public class SystemINDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            double i  = scanner.nextDouble();
            System.out.println(i);
        }

    }
}
