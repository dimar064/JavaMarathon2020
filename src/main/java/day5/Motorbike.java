package day5;

public class Motorbike {
    private int yearOfManufacture;
    private String color;
    private String model;

    public Motorbike(int yearOfManufacture, String color, String model) {
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
