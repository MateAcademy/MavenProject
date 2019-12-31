import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String str = "D:\\projectsJAVA\\MavenProject\\src\\main\\java\\Ava3";
        File dir = new File(str);
        String[] list = dir.list();
        System.out.println(Arrays.toString(list));

        for (String s : list) {
            String newStr = str + "\\" + s;
            System.out.println("dir " + new File(newStr).isDirectory());
            System.out.println("file " + new File(newStr).isFile());
            System.out.println();
        }
    }
}
