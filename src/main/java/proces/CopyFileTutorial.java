package proces;

import java.io.*;

/**
 * @author Sergey Klunniy
 */
public class CopyFileTutorial {
    private String name = "Sergei";
    private String name2 = "Yurka";

    public static void main(String[] args) throws IOException {
        CopyFileTutorial copyFileTutorial = new CopyFileTutorial();
        copyFileTutorial.printToMyFile();

    }

    private void printToMyFile() {
        File file = new File("D:\\projectsJAVA\\MavenProject\\src\\main\\java\\proces\\text.txt");
        try (OutputStream out = new FileOutputStream(file)) {
            byte[] bytes1 = name.getBytes();
            byte[] bytes2 = name2.getBytes();
            out.write(bytes1);
            out.write(bytes2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
