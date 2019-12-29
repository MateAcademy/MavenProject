package Ava.lessonIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Sergey Klunniy
 */
public class SystemIn2 {
    public static void main(String[] args) throws IOException {

        while (true) {
            int byteIn = System.in.read();
            System.out.println(byteIn);
        }
    }
}

