package ua.bakhmeteva.hw7;

import java.util.Random;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vector1 = new Vector(3, 3, 3);
        Vector vector2 = new Vector(2, 3, 5);
        System.out.println("Длина вектора = " + vector1.length());
        System.out.println("векторное произведение = " + vector1.calculateVectorCrossProduct(vector2));
        System.out.println("Косинус между векторами = " + vector1.calculateCosinesBetweenVectors(vector2));
        System.out.println("Сумма векторов = " + vector1.addVectors(vector2));
        System.out.println("Разность векторов = " + vector1.subtractVectors(vector2));
        Vector[] vectors = createMassVectors(5);
        for (Vector v: vectors) {
            System.out.println(v);
        }
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
