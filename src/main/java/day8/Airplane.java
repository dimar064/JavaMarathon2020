package day8;

public class Airplane {
    private final String producer;
    private int year;
    private int length;
    private final int weight;
    private int fuel;

    public int getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, количество топлива в баке: %d%n", producer, year, length, weight, fuel);
    }

    public void fillUp(int fuelUp) {
        fuel += fuelUp;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length > airplane2.length)
            System.out.println("Первый самолет длиннее");
        else if (airplane1.length < airplane2.length)
            System.out.println("Второй самолет длиннее");
        else
            System.out.println("Длины самолетов равны");
    }

    @Override
    public String toString() {
        return "Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length +
                ", вес: " + weight + ", количество топлива в баке: " + fuel;
    }
}
