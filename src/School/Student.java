package School;

import Handlers.RandomGen;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Grade> grades;
    private Grade grade;
    private String name;
    private int alder;

    public Student(String name, int alder) {
        this.grades = new ArrayList<>();
        addGrades();
        this.name = name;
        this.alder = alder;
    }

    public void printGrades() {
        System.out.println("Grades: ");
        for (Grade grade : grades) {
            System.out.println(grade.getSubject() + ": " + grade.getScore());
        }
    }

    public void addGrades() {
        for (int i = 0; i < 6; i++) {
            int y = RandomGen.getRandomNum();
            String subject = RandomGen.Subjects[i];
            grade = new Grade(y, subject);

            grades.add(grade);
        }
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }
}
