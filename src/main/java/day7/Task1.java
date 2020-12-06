package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airbus1 = new Airplane("airbus", 1995, 27000, 60000);
        Airplane boeing = new Airplane("boeing", 2000, 25000, 65000);
        Airplane airbus2 = new Airplane("airbus", 2005, 27000, 60000);

        Airplane.compareAirplanes(airbus1, boeing);
        Airplane.compareAirplanes(boeing, airbus2);
        Airplane.compareAirplanes(airbus1, airbus2);
    }
}