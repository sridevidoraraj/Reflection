package com.gcit.classexample;

import com.gcit.classexample.ReflectionClass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

    public static void main(String[] args) throws
            NoSuchFieldException, SecurityException {

        Class Reflection = ReflectionClass.class;

        String className = Reflection.getName();

        System.out.println("className : "+className);

        System.out.println("getModifiers : "+Reflection.getModifiers());

        System.out.println("getSuperclass : "+Reflection.getSuperclass());

        System.out.println("getPackage : "+Reflection.getPackage());

        Field[] fields =Reflection.getFields();

        for(Field oneField : fields) {

        Field field = Reflection.getField(oneField.getName());

        String fieldName = field.getName();

        System.out.println("only the public fieldNames : "+fieldName);

    }

    Field[] privateFields
            =Reflection.getDeclaredFields();

    for(Field oneField : privateFields) {
        Field field =
                Reflection.getDeclaredField(oneField.getName());

        String fieldName = field.getName();

        System.out.println("all the fieldNames in the class : "+fieldName);

    }

    Method[] methods
            =Reflection.getDeclaredMethods();

    for(Method m: methods) {

        System.out.println("methods : "+m.getName());
    }

    }

}
