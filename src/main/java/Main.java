import java.io.File;
import java.io.IOException;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String dir = "src/main/java";
        String name = "n.txt";
        File file = new File(dir, name);
        file.createNewFile();
    }
}
