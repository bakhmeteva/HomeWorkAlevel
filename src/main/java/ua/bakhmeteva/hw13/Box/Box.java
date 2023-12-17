package ua.bakhmeteva.hw13.Box;

public class Box {

    private String from;
    private String material;
    private String color;
    private LiftingCapacity maxLiftingCapacity;
    private Cargo cargo;
    private String deliveryDate;

    public Box() {
    }

    public Box(String from, String material, String color, LiftingCapacity maxLiftingCapacity, Cargo cargo, String deliveryDate) {
        this.from = from;
        this.material = material;
        this.color = color;
        this.maxLiftingCapacity = maxLiftingCapacity;
        this.cargo = cargo;
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "Box{" +
                "from='" + from + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", maxLiftingCapacity=" + maxLiftingCapacity +
                ", cargo=" + cargo +
                ", deliveryDate='" + deliveryDate + '\'' +
                '}';
    }
}
