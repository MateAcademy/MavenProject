package Ava.lessonIO;

import java.io.*;
import java.util.Scanner;

/**
 * @author Sergey Klunniy
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\projectsJAVA\\MavenProject\\src\\main\\java\\Ava\\Doc.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
