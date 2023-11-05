package ua.bakhmeteva.hw4;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        ArrayList<Integer> myArray = fillArray(400, 10);
        System.out.println(findAvgArifm(myArray));
        System.out.println(findAvgGeometric(myArray));
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

    // находим среднее арифмитическое массива
    private static double findAvgArifm(ArrayList<Integer> myArray){
        int summ = 0;
        for (Integer item : myArray) {
            summ = summ + item;

        }
        return ((double) summ / myArray.size());
    }

    //находим среднее геомертрическое массива
    private static double findAvgGeometric(ArrayList<Integer> myArray){
        double composition = 1;
        for (Integer item : myArray) {
            composition = composition * item;

        }
        return Math.sqrt(composition);
    }
}
