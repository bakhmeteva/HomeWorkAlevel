package ua.bakhmeteva.hw12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateCSVFromConsole {
    public static void main(String[] args) {
        String fullInput = getFullStringFromKeyboard();
        csvGenerator(fullInput);
    }

    private static String getFullStringFromKeyboard() {
        StringBuilder fullString = new StringBuilder();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ввод \"next\" = перенос строки, \"end\" - конец файла");
            while (true) {
                String inputString = scanner.nextLine();
                if ("end".equalsIgnoreCase(inputString)) {
                    break;
                }
                if (inputString.equalsIgnoreCase("next")) {
                    fullString.append("\n");
                } else {
                    fullString.append(inputString).append(", ");
                }
            }
        }
        return fullString.toString();
    }

    private static void csvGenerator(String text) {
        try (FileWriter fileWriter = new FileWriter("output.csv")) {
            fileWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("CSV файл успешно создан (output.csv).");
    }
}
