package com.app;

import org.jsoup.select.Evaluator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @author Sergey Klunniy
 */
public class MainReflectionHuman {
    public static void main(String[] args) {
       Class humanClass = Human.class;
        int classModifiers = humanClass.getModifiers();
 //       System.out.println(classModifiers);
        System.out.println(Modifier.isPublic(classModifiers));

        Class superClass = humanClass.getSuperclass();
        Method[] declaredMethods = superClass.getDeclaredMethods();
//        System.out.println(declaredMethods[0]);
        Constructor[] constructors = humanClass.getConstructors();
        System.out.println(Arrays.toString(constructors));

    }
}
