package ua.bakhmeteva.hw1;

public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("Before");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
