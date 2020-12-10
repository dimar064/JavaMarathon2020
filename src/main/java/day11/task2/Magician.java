package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    public Magician(int physDef, int magicDef, int physAtt, int magicAtt) {
        super(physDef, magicDef, physAtt, magicAtt);
    }

    @Override
    public String toString() {
        return "Magician{" +
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

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.getHealth() > (getMagicAtt() - getMagicAtt() * hero.getMagicDef() / 100)) {
            hero.setHealth(hero.getHealth() - (getMagicAtt() - getMagicAtt() * hero.getMagicDef() / 100));
        } else {
            hero.setHealth(MIN_HEALTH);
        }
    }
}
