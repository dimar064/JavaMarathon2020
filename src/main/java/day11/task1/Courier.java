package day11.task1;

public class Courier implements Worker {
    private int salary = 0;
    private boolean isPayed = false;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public Courier(int salary) {
        this.salary = salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "заработная плата: " + salary +
                ", бонус выплачен: " + isPayed;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else {
            if (warehouse.getCountDeliveredOrders() < 10_000) {
                System.out.println("Бонус пока не доступен");
            } else {
                isPayed = true;
                salary += 50_000;
            }
        }
    }
}
