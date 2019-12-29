package lessonIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        byte[] bytes = {230, 150, 135};

        int x = System.in.read();
        char c = (char) x;
        System.out.println("Код символа: " + c + " = " + x);

//        byteConsole();
    }

    private static void readConsoleScanner() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
    }

    private static void byteConsole() throws IOException {
        while (true) {
            int byteIn = System.in.read();
           System.out.println(byteIn);
        }
    }

    private static void symbolConsole() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        while (true) {
            int symbolIn = inputStreamReader.read();
            System.out.println(symbolIn);
        }
    }

    private static void readConsole() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String str = bufferedReader.readLine();
            System.out.println(str);
    }
}
