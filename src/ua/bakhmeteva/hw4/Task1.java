package ua.bakhmeteva.hw4;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        int[] myArray = fillArray(400, 10);
        System.out.println("Среднее арифмитическое " + findAvgArifm(myArray));
        System.out.println("Среднее геометрическое " + findAvgGeometric(myArray));
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

    // находим среднее арифмитическое массива
    private static double findAvgArifm(int[] myArray) {
        int summ = 0;
        for (Integer item : myArray) {
            summ = summ + item;

        }
        return ((double) summ / myArray.length);
    }

    //находим среднее геометрическое массива
    private static double findAvgGeometric(int[] myArray) {
        double composition = 1;
        for (Integer item : myArray) {
            composition = composition * item;

        }
        return Math.pow(composition, 1.0 / myArray.length);
    }
}
