package Ava.lessonIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

/**
 * @author Sergey Klunniy
 */
public class Test {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/Main/java/Ava/Doc1.txt");
        Path path2 = Paths.get("src/Main/java/Ava/Doc2.txt");
        Files.copy(path, path2, StandardCopyOption.COPY_ATTRIBUTES);
        byte[] s = "Hello".getBytes();
//        Files.write(path, s, StandardOpenOption.APPEND);

    }
}
