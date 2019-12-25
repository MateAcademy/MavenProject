package com.app.lesson1;

import java.lang.reflect.Field;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) {
        Class<SomeObject> someObjectClass = SomeObject.class;
        try {
            Field field = someObjectClass.getDeclaredField("age");
            Object fieldType = field.getType();

            SomeObject instance = new SomeObject("Sergey", 20);
            field.setAccessible(true);
            field.set(instance , 50);
            System.out.println(instance);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
