package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    private final int healHimself;
    private final int healTeammate;

    public Paladin(int physDef, int magicDef, int physAtt, int healHimself, int healTeammate) {
        super(physDef, magicDef, physAtt, 0);
        this.healHimself = healHimself;
        this.healTeammate = healTeammate;
    }

    @Override
    public String toString() {
        return "Paladin{" +
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
