package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city;
        while (!((city = scanner.nextLine()).equals("Stop"))) {
            switch (city) {
                case "Москва", "Владивосток", "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим", "Милан", "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль", "Манчестер", "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин", "Мюнхен", "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
        scanner.close();
    }
}
