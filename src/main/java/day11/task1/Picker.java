package day11.task1;

public class Picker implements Worker {
    private int salary = 0;
    private boolean isPayed = false;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
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
        salary += 80;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else {
            if (warehouse.getCountPickedOrders() < 10_000) {
                System.out.println("Бонус пока не доступен");
            } else {
                isPayed = true;
                salary += 70_000;
            }
        }
    }
}
