package proces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

/**
 * @author Sergey Klunniy
 */
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\projectsJAVA\\MavenProject\\src\\Doc1.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (bufferedReader.ready())
        System.out.println(bufferedReader.readLine());

    }
}
