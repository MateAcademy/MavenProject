package Ava3.ava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Kitay {
    public static void main(String[] args) throws IOException {
        File file = new File("temp.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Hello\n");
        fileWriter.write("Hello\n");
//        fileWriter.flush();
//        fileWriter.close();

    }
}
