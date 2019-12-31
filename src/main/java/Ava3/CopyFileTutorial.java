package Ava3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author Sergey Klunniy
 */
public class CopyFileTutorial {
    public static void main(String[] args) throws IOException {
        File file = new File("temp.txt");

        Path path = file.toPath();
        Files.createFile(path);

    }
}
