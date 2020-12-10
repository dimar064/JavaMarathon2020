package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private int healHimself;
    private int healTeammate;

    public Shaman(int physDef, int magicDef, int physAtt, int magicAtt, int healHimself, int healTeammate) {
        super(physDef, magicDef, physAtt, magicAtt);
        this.healHimself = healHimself;
        this.healTeammate = healTeammate;
    }

    @Override
    public String toString() {
        return "Shaman{" +
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

    @Override
    public void healHimself() {
        if (getHealth() + healHimself < MAX_HEALTH) {
            setHealth(getHealth() + healHimself);
        } else {
            setHealth(MAX_HEALTH);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() + healTeammate < MAX_HEALTH) {
            hero.setHealth(hero.getHealth() + healTeammate);
        } else {
            hero.setHealth(MAX_HEALTH);
        }
    }
}
