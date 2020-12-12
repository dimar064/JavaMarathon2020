package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < 350) {
            if (i % 2 == 0) {
                list.add(i);
            }
            i++;
            if (i == 30) {
                i = 300;
            }
        }
        System.out.println(list);
    }
}