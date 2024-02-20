package com.ivr;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInspector {

    public static void inspect(Object obj) {

        Class<?> clazz = obj.getClass();

        System.out.println("Class: " + clazz.getName());

        System.out.println("Fields:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("  " + field.getName() + " (" + field.getType().getName() + ")");
        }

        System.out.println("Methods:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("  " + method.getName());
        }
    }
}
