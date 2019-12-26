package com.app.annotation;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Sergey Klunniy
 */
public class AnnotationProcessor {
    Map<String, Object> servicesMap = new HashMap<>();

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
//        inspectService(SimpleService.class);
//        inspectService(LazyService.class);
//        inspectService(String.class);

//        loadService("com.app.annotation.LazyService");
//        loadService("com.app.annotation.SimpleService");
//        loadService("java.lang.String");
//    }


    }

    static void loadService(String className) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class<?> clazz = Class.forName(className);
        if (clazz.isAnnotationPresent(Service.class)) {
            Object serviceObj = clazz.newInstance();
        }
    }

    static void inspectService(Class<?> service) {
        if (service.isAnnotationPresent(Service.class)) {
            Method[] methods = service.getMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Init.class)) {
                    System.out.println("я нашел метод: " + method.getName() + " с аннотацией Init ");
                }
            }
        } else {
            System.out.println("Не найдено");
        }
    }
}
