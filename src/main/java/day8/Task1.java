package day8;

public class Task1 {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 20000; i++) {
            s += (i + " ");
        }
        System.out.println(s);
        long after1 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        long after2 = System.currentTimeMillis();
        System.out.println("Время работы программы 1 в миллисекундах равно: " + (after1 - before));
        System.out.println("Время работы программы 2 в миллисекундах равно: " + (after2 - after1));
    }
}
