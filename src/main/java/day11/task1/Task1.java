package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);
        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println("Первый склад: " + warehouse1);
        System.out.println("ЗП сборщика первого склада: " + picker1.getSalary());
        System.out.println("ЗП курьера первого склада: " + courier1.getSalary());

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);
        picker2.doWork();
        courier2.doWork();
        System.out.println("Второй склад: " + warehouse2);
        System.out.println("ЗП сборщика второго склада: " + picker2.getSalary());
        System.out.println("ЗП курьера второго склада: " + courier2.getSalary());

        System.out.println("Первый склад: " + warehouse1);
        System.out.println("Данные сборщика первого склада: " + picker1);
        System.out.println("Данные курьера первого склада: " + courier1);
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10_000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
