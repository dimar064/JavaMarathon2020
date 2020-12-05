package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airbus = new Airplane("airbus", 1995, 25000, 65000);
        airbus.setYear(2000);
        airbus.setLength(27000);
        airbus.fillUp(1000);
        airbus.fillUp(5000);
        airbus.info();
    }
}
