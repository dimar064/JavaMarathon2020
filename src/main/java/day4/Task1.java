package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int[] numbers = new int[n];
        Random random = new Random();
        int moreThanEight = 0;
        int equalsToOne = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(10);
            if (numbers[i] > 8) moreThanEight++;
            if (numbers[i] == 1) equalsToOne++;
            if (numbers[i] % 2 == 0) even++;
            else odd++;
            sum += numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Количество чисел больше 8: " + moreThanEight);
        System.out.println("Количество чисел равных 1: " + equalsToOne);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
