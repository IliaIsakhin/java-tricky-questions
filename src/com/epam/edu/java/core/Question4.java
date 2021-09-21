package com.epam.edu.java.core;

public class Question4 {
    public static void main(String[] args) {
        Parent parent = new Child();
        
        parent.greetings();
        parent.greet();
    }
}

class Parent {

    {
        System.out.println("Parent block");
    }
    
    static {
        System.out.println("Parent static block");
    }
    
    Parent() {
        System.out.println("Parent constructor");
    }
    
    public void greetings() {
        System.out.println("Hello im Parent");
    }
    
    public static void greet() {
        System.out.println("Hello im static Parent");
    }
}

class Child extends Parent {
    {
        System.out.println("Child block");
    }

    static {
        System.out.println("Child static block");
    }

    Child() {
        System.out.println("Child constructor");
    }

    @Override
    public void greetings() {
        System.out.println("Hello im Child");
    }

    public static void greet() {
        System.out.println("Hello im static Parent");
    }
}
