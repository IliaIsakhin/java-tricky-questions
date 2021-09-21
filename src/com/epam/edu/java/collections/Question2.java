package com.epam.edu.java.collections;

import java.util.Arrays;
import java.util.List;

public class Question2 {

    public static void main(String[] args) {
        List objects = Arrays.asList("a", "b", "c");
        
//        objects.add(new Object());
//        var a = objects.get(2);
        
        List<? extends Number> numbers = Arrays.asList(1, 2, 3, 4.0);
        
//        var a = numbers.get(1);
//        numbers.add(1);
        
        List<? super Number> numbers1 = Arrays.asList(1, 2, 3);
        
//        var a = numbers1.get(1);
//        numbers1.add(1);
    }
}
