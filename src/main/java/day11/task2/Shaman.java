package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    private final int healHimself = 50;
    private final int healTeammate = 30;
    private final int magicAtt = 15;

    public Shaman() {
        super.physDef = 20;
        super.magicDef = 20;
        super.physAtt = 10;
    }

    @Override
    public String toString() {
        return "Shaman{" +
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

    @Override
    public void healHimself() {
        if (health + healHimself < MAX_HEALTH) {
            health += healHimself;
        } else {
            health = MAX_HEALTH;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + healTeammate < MAX_HEALTH) {
            hero.health += healTeammate;
        } else {
            hero.health = MAX_HEALTH;
        }
    }
}