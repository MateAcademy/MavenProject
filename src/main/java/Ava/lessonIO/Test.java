package Ava.lessonIO;

import java.io.File;
import java.io.IOException;

/**
 * @author Sergey Klunniy
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String fileName = "Doc5.txt";
        String dirName = "lessonIO";
        String path = dirName + File.separator + fileName;
        File file = new File(path);
        System.out.println(file.createNewFile());

    }
}
