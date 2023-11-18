package ua.bakhmeteva.hw8;

public class PowDemo {
    public static void main(String[] args) {
        Pow powFunction = (number, pow) -> {
            int result = 1;
            for (int i = 0; i < pow; i++) {
                result *= number;
            }
            return result;
        };

        int number = 2;
        int exponent = 3;
        System.out.println("Число " + number + " в степени " + exponent + " равно " + powFunction.pow(number, exponent));

    }
}
