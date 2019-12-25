package com.app.lesson2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<B> bClass = B.class;
        Method[] declaredMethods = bClass.getDeclaredMethods();
        System.out.println(Arrays.toString( declaredMethods));
        declaredMethods[0].setAccessible(true);
        declaredMethods[0].invoke(new B(), null);
    }
}
