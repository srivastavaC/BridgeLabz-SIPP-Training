package Reflection;

import java.lang.reflect.*;

public class ClassInfo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("java.util.ArrayList");
        for (Method m : cls.getDeclaredMethods()) System.out.println("Method: " + m);
        for (Field f : cls.getDeclaredFields()) System.out.println("Field: " + f);
        for (Constructor<?> c : cls.getDeclaredConstructors()) System.out.println("Constructor: " + c);
    }
}
