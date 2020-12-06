package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            if (--stamina == MIN_STAMINA) {
                --countPlayers;
            }
        }
    }

    public static void info() {
        switch (6 - countPlayers) {
            case 6, 5:
                System.out.printf("Команды неполные. На поле еще есть %d свободных мест%n", 6 - countPlayers);
                break;
            case 4, 3, 2:
                System.out.printf("Команды неполные. На поле еще есть %d свободных места%n", 6 - countPlayers);
                break;
            case 1:
                System.out.println("Команды неполные. На поле еще есть 1 свободное место");
                break;
            default:
                System.out.println("На поле нет свободных мест");
        }
    }
}
