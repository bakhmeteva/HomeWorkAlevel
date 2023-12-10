package ua.bakhmeteva.hw13.Box;

import com.google.gson.annotations.SerializedName;

public class Cargo {

    String name;
    @SerializedName("class")
    String cargoClass;

    @Override
    public String toString() {
        return "Cargo{" +
                "name='" + name + '\'' +
                ", class='" + cargoClass + '\'' +
                '}';
    }
}
