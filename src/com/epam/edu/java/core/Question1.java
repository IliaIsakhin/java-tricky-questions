package com.epam.edu.java.core;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        
        one = two;
        
        two = 22;
        
        String[] a = { "a", null };
        String[] b = { "b", null };
        
        a = b;
        
        b[1] = "b";
        
        System.out.println("int = " + one);
        System.out.println("arr = " + Arrays.toString(a));
        
        mutate(one, a);

        System.out.println("int = " + one);
        System.out.println("arr = " + Arrays.toString(a));
    }
    
    static void mutate(int a, String[] b) {
        a = 3;
        b = new String[]{"c"};
    }
}
