package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a <= 0) {
            System.out.println("Ошибка ввода");
        } else if (a < 5) {
            System.out.println("Малоэтажный дом");
        } else if (a < 9) {
            System.out.println("Среднеэтажный дом");
        } else {
            System.out.println("Многоэтажный дом");
        }
    }
}
