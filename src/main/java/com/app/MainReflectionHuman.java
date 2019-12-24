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
//        Method method = mClassObject.getDeclaredMethods()[1];
//        method.invoke(human, null);

        for (Method method : methods) {
            if(isGetter(method)) System.out.println("getter: " + method);
            if(isSetter(method)) System.out.println("setter: " + method);
        }

    }
    public static boolean isGetter(Method method){
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
