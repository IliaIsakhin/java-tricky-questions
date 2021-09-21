package com.epam.edu.java.exceptions;

import java.util.Arrays;

public class Question2 {

    public static void main(String[] args) {
        Integer[] a = new Integer[10];
        
        try {
            for (int i = 0;  i <= 10; i++) {
                a[0] += i;
                a[i] = i;
            }
        } catch (Throwable e) {
            System.out.println("Oops!");
        }

        System.out.println(Arrays.toString(a));
    }
}
