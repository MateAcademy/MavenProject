package task1;

/**
 * @author Sergey Klunniy
 */
public class Test2 {
    Integer a;
    long b;
    long c;

    public static void main(String[] args) {
        Test2 test = new Test2();
        test.m();
    }

    private void m() {
        c = a + b;
        System.out.println(c);
    }

}
