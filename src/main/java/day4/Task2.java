package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }
        int max = 0;
        int min = 10000;
        int elementsEndingInZero = 0;
        int sumElementsEndingInZero = 0;
        for (int number : numbers) {
            if (number > max) max = number;
            if (number < min) min = number;
            if (number % 10 == 0) {
                elementsEndingInZero++;
                sumElementsEndingInZero += number;
            }
        }
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + elementsEndingInZero);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sumElementsEndingInZero);
    }
}
