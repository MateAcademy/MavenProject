package example;

/**
 * @author Sergey Klunniy
 */

class Base{
    public void print() {
        System.out.println("1");
    }
}

public class Child extends Base {



    public static void main(String[] args) {
        Base obj = new Child();
       obj.print();
    }
}
