package ua.bakhmeteva.hw5;

import java.util.Arrays;

public class Task3 {

    //Дан двумерный массив NxN(количество строк = количество столбцов), написать программу
    //которая поменяет местами столбцы и строки.
    public static void main(String[] args) {
        int[][] twoDimensionsArray = new int[2][2];
        twoDimensionsArray = fillArray(twoDimensionsArray);
        System.out.println("До операции " + Arrays.deepToString(twoDimensionsArray));
        System.out.println("После операции " + Arrays.deepToString(turnArray(twoDimensionsArray)));
    }

    private static int[][] fillArray(int[][] twoDimensionsArray) {
        int counter = 1;
        for (int row = 0; row < twoDimensionsArray.length; row++) {
            for (int column = 0; column < twoDimensionsArray[row].length; column++) {
                twoDimensionsArray[row][column] = counter;
                counter++;
            }
        }
        return twoDimensionsArray;
    }

    private static int[][] turnArray(int[][] twoDimensionsArray) {
        int[][] turnedArray = new int[twoDimensionsArray.length] [twoDimensionsArray[0].length];
        for (int row = 0; row < twoDimensionsArray.length; row++) {
            for (int column = 0; column < twoDimensionsArray[row].length; column++) {
                turnedArray[row][column] = twoDimensionsArray[column][row];
            }
        }
        return turnedArray;
    }
}
