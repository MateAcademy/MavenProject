package com.app;

import org.jsoup.select.Evaluator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @author Sergey Klunniy
 */
public class MainReflectionHuman {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class mClassObject = Human.class;
        Field[] fields = mClassObject.getDeclaredFields();
        Human human = new Human("Sergey", 35);
        System.out.println(human);
        Field field = mClassObject.getField("hobby");
        field.set(human, "football");
        System.out.println(human);

    }
}
