package day4;

import java.util.Random;

/**
 * предлагаю доработать, изменив условие:
 * массив не из 100, а из 100 000 элементов
 * не "тройка" чисел, а "пятидесятка"
 */

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[100_000];
        Random random = new Random();
        int adjacentElements = 50;
        int maxSumAdjacentElements = 0;
        int sumAdjacentElements = 0;
        int indexOfFirst = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10_000);
            if (i < adjacentElements) maxSumAdjacentElements = sumAdjacentElements += numbers[i];
            else {
                sumAdjacentElements = sumAdjacentElements + numbers[i] - numbers[i - adjacentElements];
                if (sumAdjacentElements >= maxSumAdjacentElements) {
                    maxSumAdjacentElements = sumAdjacentElements;
                    indexOfFirst = i - (adjacentElements - 1);
                }
            }
        }
        System.out.println(maxSumAdjacentElements);
        System.out.println(indexOfFirst);
    }
}