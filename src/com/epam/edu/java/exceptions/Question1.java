package com.epam.edu.java.exceptions;

import java.util.concurrent.ThreadLocalRandom;

public class Question1 {
    public static void main(String[] args) {
        String result = calc();

        System.out.println(result);
    }
    
    static String  calc() {
        try {
            if (ThreadLocalRandom.current().nextBoolean()) throw new NullPointerException();
            return "a";
        } catch (NullPointerException e) {
            return "b";
        } finally {
            return "c";
        }
    }
}
