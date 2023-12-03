package ua.bakhmeteva.hw11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListPerformance {
    public static void main(String[] args) {
    List<Integer> arrayList = new ArrayList<>();
    List<Integer> linkedList = new LinkedList<>();

    long startTime = System.currentTimeMillis();
    addElements(arrayList, 100000);
    long endTime = System.currentTimeMillis();
    System.out.println("Время добавления элементов в ArrayList: " + (endTime - startTime) + " мс");

    startTime = System.currentTimeMillis();
    addElements(linkedList, 100000);
    endTime = System.currentTimeMillis();
    System.out.println("Время добавления элементов в LinkedList: " + (endTime - startTime) + " мс");

    startTime = System.currentTimeMillis();
    selectRandomElements(arrayList, 100000);
    endTime = System.currentTimeMillis();
    System.out.println("Время выбора элементов из ArrayList: " + (endTime - startTime) + " мс");

    startTime = System.currentTimeMillis();
    selectRandomElements(linkedList, 100000);
    endTime = System.currentTimeMillis();
    System.out.println("Время выбора элементов из LinkedList: " + (endTime - startTime) + " мс");
}

    private static void addElements(List<Integer> list, int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(random.nextInt());
        }
    }

    private static void selectRandomElements(List<Integer> list, int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int randomIndex = random.nextInt(list.size());
            list.get(randomIndex);
        }
    }
}