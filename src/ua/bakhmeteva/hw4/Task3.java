package ua.bakhmeteva.hw4;

import java.util.ArrayList;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = fillArray(2000, 10);
        ArrayList<Integer> myArrayWithoutOdd = replaceEvenToZero(myArray);
    }

    // заполняем массив случайными числами
    private static ArrayList<Integer> fillArray(int size, int maxNumber){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            myArray.add(random.nextInt(maxNumber) + 1);

        }
        return myArray;
    }

    private static ArrayList<Integer> replaceEvenToZero(ArrayList<Integer> myArray){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (Integer item : myArray) {
            if (item % 2 == 0) {
                newArray.add(0);
            } else {
               newArray.add(item);
            }
        }
        return newArray;
    }
}
