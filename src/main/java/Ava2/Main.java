package Ava2;

import java.io.File;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("temp.txt");

        if (file.exists()) {
            System.out.println("exists");
        }
        if (file.isDirectory()) {
            System.out.println("Directory");
        }
        if (file.isFile()) {
            System.out.println("File");
        }
    }
}
