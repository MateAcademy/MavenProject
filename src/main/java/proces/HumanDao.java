package proces;

import java.util.Optional;

/**
 * @author Sergey Klunniy
 */
public class HumanDao {

    public Optional<Human> getOptional() {
        return Optional.ofNullable(new Human(20, "Sergey", new Car()));
    }
}
