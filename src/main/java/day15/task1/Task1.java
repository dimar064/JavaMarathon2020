package day15.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file1 = new File("src/main/resources/shoes.csv");
        File file2 = new File("src/main/resources/missing_shoes.txt");
        try {
            Scanner scanner = new Scanner(file1);
            PrintWriter writer = new PrintWriter(file2);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(";");
                if (data[2].equals("0")) {
                    writer.println(line);
                }
            }
            scanner.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файлы не найдены");
        }
    }
}
