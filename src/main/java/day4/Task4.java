package day4;

import java.util.Random;
import java.util.Scanner;

/**
 * кол-во чисел, объединяемых в группы для поиска (тройка, пятидесятка и т.п.),
 * должно вводиться с клавиатуры.
 * Диапазон вводимого числа от 2 до длинны массива - 1
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int[] numbers = new int[100_000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10_000);
        }
        int maxSumAdjacentElements = 0;
        int maxIndexOfFirst = 0;
        for (int i = 0; i < numbers.length - (n - 1); i++) {
            int sumAdjacentElements = 0;
            for (int j = i; j < i + n; j++) {
                sumAdjacentElements += numbers[j];
            }
            if (sumAdjacentElements >= maxSumAdjacentElements) {
                maxSumAdjacentElements = sumAdjacentElements;
                maxIndexOfFirst = i;
            }
        }
        System.out.println(maxSumAdjacentElements);
        System.out.println(maxIndexOfFirst);
    }
}