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

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
