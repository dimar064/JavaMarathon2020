package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        String assessment = null;
        switch (random.nextInt(4) + 2) {
            case 2:
                assessment = "неудовлетворительно";
                break;
            case 3:
                assessment = "удовлетворительно";
                break;
            case 4:
                assessment = "хорошо";
                break;
            case 5:
                assessment = "отлично";
        }
        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s.%n",
                name, student.getName(), subject, assessment);
    }
}
