package com.app.annotation;

/**
 * @author Sergey Klunniy
 */

@Service(name = "superSimpleService ")
public class SimpleService {

    @Init
    public void initService(){
        System.out.println("initService");
    }

    public void go(){
        System.out.println("connection");
    }
}
