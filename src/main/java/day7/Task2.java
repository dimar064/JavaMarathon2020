package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player.info();
        Player player1 = new Player(random.nextInt(10) + (Player.MAX_STAMINA-10));
        System.out.println(player1.getStamina());
        Player.info();
        Player player2 = new Player(random.nextInt(10) + (Player.MAX_STAMINA-10));
        Player.info();
        Player player3 = new Player(random.nextInt(10) + (Player.MAX_STAMINA-10));
        Player.info();
        Player player4 = new Player(random.nextInt(10) + (Player.MAX_STAMINA-10));
        Player.info();
        Player player5 = new Player(random.nextInt(10) + (Player.MAX_STAMINA-10));
        Player.info();
        Player player6 = new Player(random.nextInt(10) + (Player.MAX_STAMINA-10));
        Player.info();
        Player player7 = new Player(random.nextInt(10) + (Player.MAX_STAMINA-10));
        Player player8 = new Player(random.nextInt(10) + (Player.MAX_STAMINA-10));
        Player.info();

        for (int i = player1.getStamina(); i > 0; i--) {
            player1.run();
        }
        Player.info();
    }
}
