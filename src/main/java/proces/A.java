package proces;

import java.io.Reader;
import java.util.Optional;

/**
 * @author Sergey Klunniy
 */
public class A {
    public static void main(String[] args) {

    }

    public Optional<A> getA() {
        if (new A() == null) {
            return Optional.empty();
        } else {
            return Optional.of(new A());
        }
    }
}
