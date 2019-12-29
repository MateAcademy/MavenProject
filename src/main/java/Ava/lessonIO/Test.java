package Ava.lessonIO;

import java.io.File;
import java.io.IOException;

/**
 * @author Sergey Klunniy
 */
public class Test {
    public static void main(String[] args) throws IOException {

        File file = new File("src/Main/java/Ava/Doc1.txt");
        System.out.println(file.createNewFile());

    }
}
