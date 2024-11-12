package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {
    public static void main(String[] args) {
        // create a HashSet using the HashSet() constructor
        // add new elements to it using the add() method

        // unordered collection
        Set<String> programingLanguages = new HashSet<>();
        programingLanguages.add("Java");
        programingLanguages.add("C");
        programingLanguages.add("C++");
        programingLanguages.add("C#");
        programingLanguages.add("Python");
        programingLanguages.add("PHP");

        System.out.println(programingLanguages);

        // let's add a duplicate element
        programingLanguages.add("C++");
        System.out.println(programingLanguages);
    }
}
