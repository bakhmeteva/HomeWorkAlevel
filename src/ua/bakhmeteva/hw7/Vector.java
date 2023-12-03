package ua.bakhmeteva.hw7;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(int x1, int x2, int y1, int y2, int z1, int z2) {
        this.x = x2 - x1;
        this.y = y2 - y1;
        this.z = z2 - z1;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double length(){
        return Math.sqrt(x * x + y * y + z * z);
    }


    //метод, вычисляющий векторное произведение с другим вектором
    public Vector calculateVectorCrossProduct(Vector v2) {
        double i = this.getY() * v2.getZ() - this.getZ() * v2.getY();
        double j = this.getZ() * v2.getX() - this.getX() * v2.getZ();
        double k = this.getX() * v2.getY() - this.getY() * v2.getX();
        return new Vector(i, j, k);
    }

    //Косинус между векторами
    public double calculateCosinesBetweenVectors(Vector v2) {
        double dotProduct = this.getX() * v2.getX() + this.getY() * v2.getY() + this.getZ() * v2.getZ();
        double lengthV1 = this.length();
        double lengthV2 = v2.length();
        if (lengthV1 == 0 || lengthV2 == 0) {
            throw new IllegalArgumentException("Длина вектора не может быть равной нулю.");
        }
        return dotProduct / (lengthV1 * lengthV2);
    }


    // Метод для сложения двух векторов
    public Vector addVectors(Vector v2) {
        double sumX = this.getX() + v2.getX();
        double sumY = this.getY() + v2.getY();
        double sumZ = this.getZ() + v2.getZ();

        return new Vector(sumX, sumY, sumZ);
    }

    // Метод для вычитания одного вектора из другого
    public Vector subtractVectors(Vector v2) {
        double diffX = this.getX() - v2.getX();
        double diffY = this.getY() - v2.getY();
        double diffZ = this.getZ() - v2.getZ();

        return new Vector(diffX, diffY, diffZ);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
