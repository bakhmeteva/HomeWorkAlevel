package ua.bakhmeteva.hw5;

import java.util.Arrays;

public class Task2 {
    //2. Проверить заданный массив на упорядоченность по убыванию.
    public static void main(String[] args) {
        int[] myArray = new int[]{2, 5, 4};
        int[] myArray1 = new int[]{9, 8, 4};
        System.out.println("Массив сортированный по убыванию myArray " +  isArraySorted(myArray));
        System.out.println("Массив сортированный по убыванию myArray1 " +  isArraySorted(myArray1));
    }

    private static boolean isArraySorted(int[] myArray){
        System.out.println("Массив переданный в метод " + Arrays.toString(myArray));
        int[] sortedArray = Arrays.stream(myArray).sorted().toArray();
        System.out.println("Массив отсортирован по возрастанию " + Arrays.toString(sortedArray));
        int[] reverseSortedArray = new int[sortedArray.length];
        for (int i=0; i < myArray.length; i++) {
            reverseSortedArray[i] = sortedArray[sortedArray.length - i - 1];
        }
        System.out.println("Массив отсортирован по убыванию " + Arrays.toString(reverseSortedArray));
        return Arrays.equals(reverseSortedArray, myArray);
    }
}
