package day11.task2;

public abstract class Hero implements PhysAttack {
    public static final int MAX_HEALTH = 100;
    public static final int MIN_HEALTH = 0;

    protected int health;
    protected int physDef;
    protected int magicDef;
    protected int physAtt;

    public Hero() {
        this.health = MAX_HEALTH;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double amountOfDamage = physAtt - physAtt * hero.physDef / 100.0;
        if (hero.health > amountOfDamage) {
            hero.health -= amountOfDamage;
        } else {
            hero.health = MIN_HEALTH;
        }
    }
}
