package com.gcit.methodexample;

public class Demo {
    int a = 50;
    int b = 10;

    public void add(){
        System.out.println("sum : " +(a+b));
    }

    protected void sub(){
        System.out.println("subtraction : " +(a-b));
    }

    protected void mul(){
        System.out.println("multiplication : " +(a*b));
    }

    private void div(){
        System.out.println("division : " +(a/b));
    }
}
