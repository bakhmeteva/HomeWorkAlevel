package ua.bakhmeteva.hw10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListCycles {
    public static void main(String[] args) {
        ArrayList <String> myList = new ArrayList<>(Arrays.asList("Str1", "Str2", "Str3", "Str4"));
        forEachCycle(myList);
        forCycle(myList);
        whileCycle(myList);
        iteratorCycle(myList);

    }

    public static void forEachCycle(List<String> list){
        for (String s: list) {
            System.out.println("For each [" + s + "]");
        }
    }

    public static void forCycle(List<String> list){
        for (int i=0; i<list.size(); i++) {
            System.out.println("For [" + list.get(i) + "]");
        }
    }

    public static void whileCycle(List<String> list){
        int i = 0;
        while ( i<list.size()) {
            System.out.println("while [" + list.get(i) + "]");
            i++;
        }
    }

    public static void iteratorCycle(List<String> list){
        Iterator<String> iterator = list.iterator();
        while ( iterator.hasNext()) {
            System.out.println("iterator [" + iterator.next() + "]");
        }
    }



}
