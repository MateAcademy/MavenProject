package com.app;

import org.jsoup.select.Evaluator;

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * @author Sergey Klunniy
 */
public class MainReflectionHuman {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InvocationTargetException {
        Class mClassObject = Human.class;
        Human human = new Human("Sergey", 35);

        Method[] methods = mClassObject.getMethods();

//        System.out.println(Arrays.toString(methods));
//        mClassObject.getDeclaredMethods();
        Method method = mClassObject.getDeclaredMethods()[1];
        method.invoke(human, null);

    }
}
