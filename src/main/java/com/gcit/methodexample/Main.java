package com.gcit.methodexample;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String args[]){

        try {
            Demo d = new Demo();
            Class c = d.getClass();
            Method[] methods = c.getDeclaredMethods();
            for(Method m : methods) {
                System.out.println("Method Name : " + m.getName());

                int modifier = m.getModifiers();
                System.out.print("Modifier : " + Modifier.toString(modifier) + "  ");

                System.out.print("Return Type : " + m.getReturnType());
                System.out.println("\n");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
