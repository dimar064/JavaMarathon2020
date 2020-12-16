package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            int sum = 0;
            int i = 0;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                i++;
            }
            double result = (double) sum / i;
            scanner.close();
            System.out.printf(result + " --> %.3f", result);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}