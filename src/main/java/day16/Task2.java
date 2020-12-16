package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("test1.txt");
        Random random = new Random();
        PrintWriter writer = new PrintWriter(file1);
        for (int i = 0; i < 1000; i++) {
            writer.print(random.nextInt(100) + " ");
        }
        writer.close();

        File file2 = new File("test2.txt");
        PrintWriter writer1 = new PrintWriter(file2);
        Scanner scanner = new Scanner(file1);
        String[] numbers = scanner.nextLine().split(" ");
        int n = 20;
        for (int i = 0; i < numbers.length / n; i++) {
            double sum = 0;
            for (int j = n * i; j < n * (i + 1); j++) {
                sum += Integer.parseInt(numbers[j]);
            }
            writer1.print(sum / n + " ");
        }
        writer1.close();
        scanner.close();

        printResult(file2);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String[] numbers = scanner.nextLine().split(" ");
            double sum = 0;
            for (String number : numbers) {
                sum += Double.parseDouble(number);
            }
            System.out.println((int) sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
