package com.app.lesson1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
            field.set(instance, 50);
            System.out.println(instance);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    public static void printGetersOrSetters(Class aClass) {
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            if (isGetter(method)) System.out.println("getter: " + method);
            if (isSetter(method)) System.out.println("setter: " + method);
        }
    }


    public static boolean isGetter(Method method) {
        if (!method.getName().startsWith("get")) {
            return false;
        }
        if (method.getParameterTypes().length != 0) {
            return false;
        }
        if (void.class.equals(method.getReturnType())) {
            return false;
        }
        return true;
    }

    public static boolean isSetter(Method method){
        if (!method.getName().startsWith("set")) {
            return false;
        }
        if (method.getParameterTypes().length != 1) {
            return false;
        }
        return true;
    }
}
