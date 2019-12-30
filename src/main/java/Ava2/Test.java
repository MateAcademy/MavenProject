package Ava2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author Sergey Klunniy
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Reader bufReader = new BufferedReader(new InputStreamReader(System.in));
        String b =  ((BufferedReader) bufReader).readLine();
        System.out.println(b);
    }
}
