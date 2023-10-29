package lesson2;

public class EvenOrOdd {

    public static void main(String[] args) {
        int number = 21;
        // Проверяем, является ли число четным или нечетным
        if (number % 2 == 0) {
            System.out.println(number + " является четным числом.");
        } else {
            System.out.println(number + " является нечетным числом.");
        }
    }
}
