package Ava2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Sergey Klunniy
 */
public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\projectsJAVA\\MavenProject\\src\\Doc1.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine() ) {
            System.out.println(scanner.nextLine()  );
        }
        scanner.close();
    }
}
