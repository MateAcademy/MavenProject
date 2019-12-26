package com.app.annotation;

/**
 * @author Sergey Klunniy
 */
@Service(name = "veryLazyWorkingService")
public class LazyService extends A{

    private int age;

    @Override
    public String toString() {
        return "LazyService{" +
                "age=" + age +
                '}';
    }

    public LazyService(int age) {
        this.age = age;
    }

    @Init
    public void lazyInit() throws Exception {
        System.out.println("lazyInit");
    }
    @Init
    public void lazyInit2() throws Exception {
        System.out.println("lazyInit");
    }
}
