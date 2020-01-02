package proces;

import java.io.*;
import java.util.Optional;

/**
 * @author Sergey Klunniy
 */
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\projectsJAVA\\MavenProject\\src\\Doc1.txt");
        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
