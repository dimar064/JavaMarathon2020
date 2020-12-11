package day11.task2;

public class Magician extends Hero implements MagicAttack {
    private final int magicAtt = 20;

    public Magician() {
        super.physDef = 0;
        super.magicDef = 80;
        super.physAtt = 5;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }

    @Override
    public void magicalAttack(Hero hero) {
        double amountOfDamage = magicAtt - magicAtt * hero.magicDef / 100.0;
        if (hero.health > amountOfDamage) {
            hero.health -= amountOfDamage;
        } else {
            hero.health = MIN_HEALTH;
        }
    }
}