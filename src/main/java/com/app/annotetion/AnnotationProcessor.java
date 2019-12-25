package com.app.annotetion;

import java.lang.reflect.Method;

/**
 * @author Sergey Klunniy
 */
public class AnnotationProcessor {
    public static void main(String[] args) {
        inspectService(SimpleService.class);
        inspectService(LazyService.class);
        inspectService(String.class);
    }

    static void inspectService(Class<?> service) {
        if (service.isAnnotationPresent(Service.class)) {
            Method[] methods = service.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Init.class)) {
                    System.out.println("я нашел метод: " + method.getName() + " с аннотацией Init");
                }
            }
        } else {
            System.out.println("Не найдено");
        }
    }
}
