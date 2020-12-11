package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Mercedes");
        list.add("Lada");
        list.add("Nissan");
        list.add("Audi");

        list.add(3,"UAZ");
        list.remove(0);
        System.out.println(list);
    }
}