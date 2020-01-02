package proces;

import java.io.*;
import java.util.Optional;

/**
 * @author Sergey Klunniy
 */
public class Main {

    public static void main(String[] args) throws IOException {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in); // поток чтения с консоли
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  // соединяем InputStreamReader с BufferedReader

            File file = new File("file.txt");
            FileWriter fileWriter = new FileWriter(file); // поток, который подключается к текстовому файлу
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // соединяем FileWriter с BufferedWriter

            String line;
            while(!(line = bufferedReader.readLine()).equals("exit")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            bufferedReader.close(); // закрываем поток
            bufferedWriter.close(); // закрываем поток
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}