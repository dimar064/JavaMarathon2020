package day9.Task1;

public class Student extends Human{
   private String groupName;

    public Student(String name, String groupNime) {
        super(name);
        this.groupName = groupNime;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + super.getName());
    }
}