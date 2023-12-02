package ua.bakhmeteva.hw2;

public class Task3 {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = -7;
        int n3 = 3;

        int absN1 = Math.abs(n1);
        int absN2 = Math.abs(n2);
        int absN3 = Math.abs(n3);

        if (absN1 <= absN2 && absN1 <= absN3) {
            System.out.println("Число с наименьшим модулем: " + n1);
        } else if (absN2 <= absN1 && absN2 <= absN3) {
            System.out.println("Число с наименьшим модулем: " + n2);
        } else {
            System.out.println("Число с наименьшим модулем: " + n3);
        }

    }
}
