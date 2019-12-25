package com.app.annotetion;

/**
 * @author Sergey Klunniy
 */
@Service(name = "veryLazyWorkingService")
public class LazyService {

    @Init
    public void lazyInit() throws Exception {
        System.out.println("lazyInit");
    }
}
