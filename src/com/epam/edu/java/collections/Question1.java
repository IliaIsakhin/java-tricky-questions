package com.epam.edu.java.collections;

import java.util.HashMap;
import java.util.Objects;

public class Question1 {

    public String a;

    public Question1(String a) {
        this.a = a;
    }

    public static void main(String[] args) {
        var map = new HashMap<Question1, String>();

        Question1 key = new Question1("a");
        map.put(key, "hello world");
        map.put(key, "foo bar");
        
        key.a = "b";

        System.out.println(map.get(key));
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Question1 question1 = (Question1) o;
//        return Objects.equals(a, question1.a);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(a);
//    }
}
