package Ava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Читаю с файла Doc1.txt
 *
 */
public class SystemIN {
      public static void main(String[] args) throws IOException {

        byte[] bytes = Files.readAllBytes(Paths.get("D:\\projectsJAVA\\MavenProject\\src\\Doc1.txt"));
        System.out.println(new String(bytes));

    }
}
