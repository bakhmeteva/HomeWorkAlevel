package ua.bakhmeteva.hw4;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] myArray = fillArray(1000, 10);
        System.out.println("Количество простых чисел " + getPrimeNumbersAmount(myArray));
    }

    // заполняем массив случайными числами
    private static int[] fillArray(int size, int maxNumber){
        int[] myArray = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            myArray[i] = random.nextInt(maxNumber) + 1;

        }
        return myArray;
    }

    private static int getPrimeNumbersAmount (int[] myArray){
        int numbersAmount = 0;
        for (Integer item : myArray) {
            if (isPrime(item)){
                numbersAmount++;
            }

        }
        return numbersAmount;
    }


    //является ли число простым
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Числа меньше или равные 1 не являются простыми.
        }
        if (number <= 3) {
            return true; // Числа 2 и 3 считаются простыми.
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false; // Если число делится на 2 или 3, то оно не простое.
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false; // Если число делится на i или i + 2, то оно не простое.
            }
        }
        return true; // Если ни одно из условий не выполнено, число считается простым.
    }


}