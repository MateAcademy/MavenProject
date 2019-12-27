package стримы;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) {
        Stream.of(1, 5, 7, 8, 9);

        List<String> names = new ArrayList<>();
        names.add("German");
        names.add("Tania");
        names.add("Artur");
        names.add("Sergei");
        names.add("Kata");

        names.stream().forEach(x-> System.out.println(x));
        names.stream().forEach(System.out::println);
    }
}
