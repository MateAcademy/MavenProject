package Ava.lessonIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Sergey Klunniy
 */
public class Test {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("Doc.txt");


        File file = new File("src/Main/java/Ava/Doc1.txt");
        System.out.println(file.exists());
        System.out.println(file.createNewFile());

        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());

//        file.delete();
    }
}
