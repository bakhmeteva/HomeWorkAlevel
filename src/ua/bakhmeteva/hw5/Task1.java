package ua.bakhmeteva.hw5;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[][] twoDimensionsArray = new int[4][3];
        System.out.println(Arrays.deepToString(fillArray(twoDimensionsArray)));
}

    //Заполнение двумерного массива значениями индекса (от 1 и до кол-ва элементов в
    //массиве), при этом каждая вторая строка - отрицательными значениями.
    private static int[][] fillArray(int[][] twoDimensionsArray) {
        int counter = 1;
        for (int row = 0; row < twoDimensionsArray.length; row++) {
            for (int column = 0; column < twoDimensionsArray[row].length; column++) {
                if ((row +1) % 2 == 1) {
                    twoDimensionsArray[row][column] = counter;
                } else {
                    twoDimensionsArray[row][column] = -counter;
                }
                counter++;
            }
        }
        return twoDimensionsArray;
    }
}
