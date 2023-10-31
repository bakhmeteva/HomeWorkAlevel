package ua.bakhmeteva.hw3;

import java.util.Scanner;

public class Task2 {
    //Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество слов в ней.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();
        scanner.close();

        System.out.println("В строке [" + inputString + "] " + getWordsCount(inputString) + " слов(а)");
    }

    private static int getWordsCount(String line){
        return line.length() - line.replace(" ", "").length() + 1;
    }
}
