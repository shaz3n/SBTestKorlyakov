package org.example;

import java.lang.reflect.*;

public class ClassAnalyz{
    public static void analyze(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            System.out.println("Класс: " + clazz.getName());
            System.out.println("Модификаторы: " + Modifier.toString(clazz.getModifiers()));

            System.out.println("\nПоля:");
            for (Field field : clazz.getDeclaredFields()) {
                System.out.println(" - " + Modifier.toString(field.getModifiers()) + " " + field.getType().getSimpleName() + " " + field.getName());
            }

            System.out.println("\nМетоды:");
            for (Method method : clazz.getDeclaredMethods()) {
                System.out.print(" - " + Modifier.toString(method.getModifiers()) + " " + method.getReturnType().getSimpleName() + " " + method.getName() + "(");
                Class<?>[] params = method.getParameterTypes();
                for (int i = 0; i < params.length; i++) {
                    System.out.print(params[i].getSimpleName());
                    if (i < params.length - 1) System.out.print(", ");
                }
                System.out.println(")");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Класс не найден: " + className);
        }
    }
}