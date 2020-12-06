package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2015);
        car.setColor("Зеленый");
        car.setModel("Нива");
        Motorbike motorbike = new Motorbike("ИЖ", "Голубой", 1995);
        car.info();
        motorbike.info();
        System.out.println(car.yearDifference(1990));
        System.out.println(car.yearDifference(2020));
        System.out.println(motorbike.yearDifference(1990));
        System.out.println(motorbike.yearDifference(2020));
    }
}
