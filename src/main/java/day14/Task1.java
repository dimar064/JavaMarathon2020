package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            int sum = 0;
            int i = 0;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                i++;
            }
            scanner.close();
            if (i != 10) {
                throw new IOException("Некорректный входной файл");
            } else {
                System.out.println(sum);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}