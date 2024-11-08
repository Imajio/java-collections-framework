package com.java.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchIteratationExample {
    public static void main(String[] args) {
        LinkedList<String> progLangs = new LinkedList<>();

        progLangs.add("Java");
        progLangs.add("C");
        progLangs.add("C++");
        progLangs.add("C#");
        progLangs.add("Python");
        progLangs.add("JavaScript");
        progLangs.add("C");

        boolean result = progLangs.contains("Java");
        System.out.println(" result = " + result);

        //Find the index of the first occurrence of an element in the LinkedList
        int index = progLangs.indexOf("C++");
        System.out.println(" index = " + index);

        //Find the index of the last occurrence of an element in the LinkedList
        int lastIndex = progLangs.lastIndexOf("C");
        System.out.println(" lastIndex => " + lastIndex);

        // iterator
        Iterator<String> iterator = progLangs.iterator();
        while (iterator.hasNext()) {
            String progLang = (String) iterator.next();
            System.out.println(progLang);
        }

        // forEach
        progLangs.forEach((element) -> {
            System.out.println((String) element);
        });

        // for each advanced loop
        for (String e : progLangs) {
            System.out.println(e);
        }
    }
}
