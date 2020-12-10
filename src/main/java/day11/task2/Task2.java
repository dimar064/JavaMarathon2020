package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(80, 0, 30);
        Paladin paladin = new Paladin(50, 20, 15, 25, 10);
        Magician magician = new Magician(0, 80, 5, 20);
        Shaman shaman = new Shaman(20, 20, 10, 15, 50, 30);

        warrior.physicalAttack(paladin);
        System.out.println(paladin);

        paladin.physicalAttack(magician);
        System.out.println(magician);

        shaman.healTeammate(magician);
        System.out.println(magician);

        magician.magicalAttack(paladin);
        System.out.println(paladin);

        shaman.physicalAttack(warrior);
        System.out.println(warrior);

        paladin.healHimself();
        System.out.println(paladin);

        System.out.println();
        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
            System.out.println(magician);
        }

    }
}
