package lesson1;

public class SwapVariables2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("Before");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a ^ b;
        b = a ^ b;
        a ^= b;

        System.out.println("After");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
