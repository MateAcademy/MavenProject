package Ava2;

import java.io.File;
import java.io.IOException;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("temp.txt");

        if (!file.isFile()) {
            file.createNewFile();
            System.out.println("File");
        }
    }
}
