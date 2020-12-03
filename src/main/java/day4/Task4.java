package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }
        int maxSumThreeAdjacentElements = 0;
        int indexOfFirst = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            int sumThreeAdjacentElements = numbers[i] + numbers[i + 1] + numbers[i + 2];
            if (sumThreeAdjacentElements >= maxSumThreeAdjacentElements) {
                maxSumThreeAdjacentElements = sumThreeAdjacentElements;
                indexOfFirst = i;
            }
        }
        System.out.println(maxSumThreeAdjacentElements);
        System.out.println(indexOfFirst);
    }
}
