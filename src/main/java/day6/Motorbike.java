package day6;

public class Motorbike {
    private final String model;
    private final String color;
    private final int year;

    public Motorbike(String model, String color, int year) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYearOfManufacture() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int yearCompare) {
        return this.year - yearCompare;
    }
}
