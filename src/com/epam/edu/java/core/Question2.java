package com.epam.edu.java.core;

import java.util.Locale;

public class Question2 {

    public static void main(String[] args) {
        String s1 = "s";
        String s2 = new String("s");
        String s3 = "s";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        s3.toUpperCase(Locale.ROOT);
        
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
