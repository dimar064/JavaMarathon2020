package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(1995,"Голубой","ИЖ");

        System.out.println("Год выпуска: " + motorbike.getYearOfManufacture());
        System.out.println("Цвет: " + motorbike.getColor());
        System.out.println("Модель: " + motorbike.getModel());
    }
}
