package Ava3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 * @author Sergey Klunniy
 */
public class CopyFileTutorial {
    public static void main(String[] args) throws IOException {

        copy();
    }

    private static boolean copy()  {
        File file = new File("temp.txt");
        File file2 = new File("temp2.txt");
        try {
            Files.copy(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
