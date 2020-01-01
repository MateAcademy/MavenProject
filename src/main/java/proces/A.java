package proces;

import javax.swing.text.html.Option;
import java.io.Reader;
import java.util.Optional;

/**
 * @author Sergey Klunniy
 */
public class A {
    public static void main(String[] args) {

        System.out.println(printName().orElse("Sergei"));
    }

    public Optional<A> getA() {
        if (new A() == null) {
            return Optional.empty();
        } else {
            return Optional.of(new A());
        }
    }

    private static Optional<String> printName() {
        return Optional.empty();
    }
}
