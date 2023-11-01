package ua.bakhmeteva.hw3;

public class Task2 {
    //Удалить из строки пробелы и определить, является ли она перевертышем (палиндромом)
    public static void main(String[] args) {
        String s1 = "А роза упала на лапу Азора  ";
        String s2 = "А розd";

        printIsLinePalindrome(s1);
        printIsLinePalindrome(s2);
    }

    private static void printIsLinePalindrome(String line) {
        if (isPalindrome(line)){
            System.out.println("Строка [" + line + "] - палиндром");
        } else {
            System.out.println("Строка [" + line + "] - НЕ палиндром");
        }
    }

    private static boolean isPalindrome(String line){
        String trimmedLine = line.toLowerCase().trim().replaceAll(" ", "");
        String turnedLine = "";
        for (int i = 0; i < trimmedLine.length(); i++) {
            turnedLine = trimmedLine.toCharArray()[i] + turnedLine;
        }
        return trimmedLine.equals(turnedLine);
    }


}
