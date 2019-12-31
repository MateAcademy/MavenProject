package Ava3;

import java.io.*;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("temp.txt");

        FileWriter fileWriter = new FileWriter(file);
//        fileWriter.write("Hello\n");
//        fileWriter.write("Sergei\n");
//        fileWriter.flush();
//        fileWriter.close();

        FileReader fileReader = new FileReader(file);
        char[] chars = new char[21];
        fileReader.read(chars);
        System.out.println(chars);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Tolik");
        bufferedWriter.newLine();
        bufferedWriter.write("Tolik");
        bufferedWriter.flush();

    }
}
