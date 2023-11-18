package ua.bakhmeteva.hw7;

import java.util.Random;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vector1 = new Vector(3, 3, 3);
        Vector vector2 = new Vector(2, 3, 5);
        System.out.println("Длина вектора = " + vector1.length());
        System.out.println("векторное произведение = " + calculateVectorCrossProduct(vector1, vector2));
        System.out.println("Косинус между векторами = " + calculateCosinesBetweenVectors(vector1, vector2));
        System.out.println("Сумма векторов = " + addVectors(vector1, vector2));
        System.out.println("Разность векторов = " + subtractVectors(vector1, vector2));
        Vector[] vectors = createMassVectors(5);
        for (Vector v: vectors) {
            System.out.println(v);
        }
    }

    //метод, вычисляющий векторное произведение с другим вектором
    public static Vector calculateVectorCrossProduct(Vector v1, Vector v2) {
        double i = v1.getY() * v2.getZ() - v1.getZ() * v2.getY();
        double j = v1.getZ() * v2.getX() - v1.getX() * v2.getZ();
        double k = v1.getX() * v2.getY() - v1.getY() * v2.getX();
        return new Vector(i, j, k);
    }

    //Косинус между векторами
    public static double calculateCosinesBetweenVectors(Vector v1, Vector v2) {
        double dotProduct = v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ();
        double lengthV1 = v1.length();
        double lengthV2 = v2.length();
        if (lengthV1 == 0 || lengthV2 == 0) {
            throw new IllegalArgumentException("Длина вектора не может быть равной нулю.");
        }
        return dotProduct / (lengthV1 * lengthV2);
    }


    // Метод для сложения двух векторов
    public static Vector addVectors(Vector v1, Vector v2) {
        double sumX = v1.getX() + v2.getX();
        double sumY = v1.getY() + v2.getY();
        double sumZ = v1.getZ() + v2.getZ();

        return new Vector(sumX, sumY, sumZ);
    }

    // Метод для вычитания одного вектора из другого
    public static Vector subtractVectors(Vector v1, Vector v2) {
        double diffX = v1.getX() - v2.getX();
        double diffY = v1.getY() - v2.getY();
        double diffZ = v1.getZ() - v2.getZ();

        return new Vector(diffX, diffY, diffZ);
    }

    private static Vector[] createMassVectors(int n) {
        Vector[] vectors = new Vector[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(
                    10 * random.nextDouble(),
                    10 * random.nextDouble(),
                    10 * random.nextDouble()
            );
        }
        return vectors;
    }

}
