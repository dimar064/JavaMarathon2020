package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        Random random = new Random();
        int maxSumLine = 0;
        int indexLine = 0;
        for (int i = 0; i < array.length; i++) {
            int sumLine = 0;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
                sumLine += array[i][j];
            }
            if (sumLine >= maxSumLine) {
                maxSumLine = sumLine;
                indexLine = i;
            }
        }
        System.out.println(indexLine);
    }
}