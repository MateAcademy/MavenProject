package proces;

import java.io.IOException;
import java.util.Optional;

/**
 * @author Sergey Klunniy
 */
public class Main {
    private final static HumanDao humanDao = new HumanDao();

    public static void main(String[] args) throws IOException {
        Optional<Human> optHuman = humanDao.getOptional();
        Optional<SuperHuman> superHuman = optHuman.map(xxx -> new SuperHuman(xxx, "power"));

    }
}
