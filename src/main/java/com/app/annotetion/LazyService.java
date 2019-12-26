package com.app.annotetion;

/**
 * @author Sergey Klunniy
 */
@Service(name = "veryLazyWorkingService")
public class LazyService extends A{

    @Init
    public void lazyInit() throws Exception {
        System.out.println("lazyInit");
    }
    @Init
    public void lazyInit2() throws Exception {
        System.out.println("lazyInit");
    }
}
