package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior(int physDef, int magicDef, int physAtt) {
        super(physDef, magicDef, physAtt, 0);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + getHealth() +
                '}';
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.getHealth() > (getPhysAtt() - getPhysAtt() * hero.getPhysDef() / 100)) {
            hero.setHealth(hero.getHealth() - (getPhysAtt() - getPhysAtt() * hero.getPhysDef() / 100));
        } else {
            hero.setHealth(MIN_HEALTH);
        }
    }
}