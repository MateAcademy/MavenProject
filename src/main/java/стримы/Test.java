package стримы;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author Sergey Klunniy
 */
public class Test {
    public static void main(String[] args) throws IOException {

//        int r = System.in.read();
//        System.out.println(r);

//        while (true) {
//            int byteIn = System.in.read();
//            System.out.println(byteIn);

//        System.out.println((char)25991);

        InputStreamReader io = new InputStreamReader(System.in);
        while (true) {
            int s = io.read();
            System.out.print((char)s);
            if (s==10) break;
        }




    }
}
