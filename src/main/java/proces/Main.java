package proces;

import java.io.IOException;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder("cmd","/c", "\\dir");
        Process process = processBuilder.start();

    }
}
