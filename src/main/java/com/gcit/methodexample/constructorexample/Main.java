package com.gcit.methodexample.constructorexample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        try {
            Demo demo = new Demo();
            Class obj = demo.getClass();

            Constructor[] constructors = obj.getDeclaredConstructors();

            System.out.println("Constructors for Person Class : ");
            for(Constructor c : constructors) {

                System.out.println("Constructor Name : " + c.getName());

                int modifier = c.getModifiers();
                System.out.print ("Modifier : " + Modifier.toString(modifier) + "  ");

                System.out.println("Parameters : " + c.getParameterCount());

                if(c.getParameterCount() > 0){
                    Class[] paramList=c.getParameterTypes();
                    System.out.print ("Constructor parameter types : ");
                    for (Class class1 : paramList) {
                        System.out.print(class1.getName() +"  ");
                    }
                }
                System.out.println("\n");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
