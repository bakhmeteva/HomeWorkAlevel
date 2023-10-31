package ua.bakhmeteva.hw2;

public class Task1 {
    //Заданы плоские декартовы координаты треугольника. Например A(1, 5), B(3, 5), C(6, 7)
    //• Найти площадь треугольника и вывести в консоль.
    public static void main(String[] args) {
        int xA = 1;
        int yA = 5;

        int xB = 3;
        int yB = 5;

        int xC = 6;
        int yC = 7;

        double ab = getLineLength(xA, yA, xB, yB);
        double ac = getLineLength(xA, yA, xC, yC);
        double bc = getLineLength(xB, yB, xC, yC);

        System.out.println("Площадь треугольника = " + getSquare(ab, bc, ac));


    }

    private static double getLineLength(int x1, int y1, int x2, int y2) {
        // Разница в координатах по оси X
        int deltaX = x2 - x1;
        // Разница в координатах по оси Y
        int deltaY = y2 - y1;
        // Используем теорему Пифагора для вычисления длины линии
        double length = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return length;
    }

    private static double getSquare(double length1, double length2, double length3) {
        // Полупериметр треугольника
        double s = (length1 + length2 + length3) / 2.0;
        // Используем формулу Герона для вычисления площади
        double area = Math.sqrt(s * (s - length1) * (s - length2) * (s - length3));
        return area;
    }


}
