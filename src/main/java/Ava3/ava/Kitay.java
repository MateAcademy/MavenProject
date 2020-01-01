package Ava3.ava;

import java.io.*;

public class Kitay {
    public static void main(String[] args) throws IOException {
        File file = new File("temp.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Hello\n");
        fileWriter.write("Hello\n");
        fileWriter.flush();
        fileWriter.close();

        FileReader fileReader = new FileReader(file);
        char[] chars = null;
        if (file.canRead()) {
            chars = new char[20];
            fileReader.read(chars);
        }
        System.out.println(new String(chars));
    }
}
