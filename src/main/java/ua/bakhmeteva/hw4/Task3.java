package ua.bakhmeteva.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] myArray = fillArray(2000, 10);
        int[] myArrayWithoutOdd = replaceEvenToZero(myArray);
        System.out.println(Arrays.toString(myArrayWithoutOdd));
    }

    // заполняем массив случайными числами
    private static int[] fillArray(int size, int maxNumber) {
        int[] myArray = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            myArray[i] = random.nextInt(maxNumber) + 1;

        }
        return myArray;
    }

    private static int[] replaceEvenToZero(int[] myArray) {
        int[] newArray = new int[myArray.length];
        ;
        for (int i = 0; i < newArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                newArray[i] = 0;
            } else {
                newArray[i] = myArray[i];
            }
        }
        return newArray;
    }
}
