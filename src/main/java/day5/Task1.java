package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfManufacture(2015);
        car.setColor("Зеленый");
        car.setModel("Нива");

        System.out.println("Год выпуска: " + car.getYearOfManufacture());
        System.out.println("Цвет: " + car.getColor());
        System.out.println("Модель: " + car.getModel());
    }
}
