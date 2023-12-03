package ua.bakhmeteva.hw3;

import java.util.Scanner;

public class Task3 {
    //Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество слов в ней.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();
        scanner.close();

        System.out.println("В строке [" + inputString + "] " + getWordsCount(inputString) + " слов(а)");
    }

    private static int getWordsCount(String line){
        // Убираем пробелы вначале, вконце и обрабатываем множественные пробелы
        String strippedLine = line.strip().replaceAll("\\s+", " ");
        //Получаем кол-во слов
        return strippedLine.length() - strippedLine.replace(" ", "").length() + 1;
    }
}
