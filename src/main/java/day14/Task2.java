package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(" ");
                if (Integer.parseInt(data[1]) < 0) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
                        list.clear();
                        break;
                    }
                } else {
                    list.add(line);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return list;
    }
}
