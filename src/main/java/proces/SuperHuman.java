package proces;

/**
 * @author Sergey Klunniy
 */
public class SuperHuman {
    private int age;
    private String name;
    private String spesialMagic;

    public SuperHuman(Human human, String spesialMagic) {
        this.age = human.getAge();
        this.name = human.getName();
        this.spesialMagic = spesialMagic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
