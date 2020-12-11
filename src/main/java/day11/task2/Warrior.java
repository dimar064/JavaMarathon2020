package day11.task2;

public class Warrior extends Hero {

    public Warrior() {
        super.physDef = 80;
        super.physAtt = 30;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}