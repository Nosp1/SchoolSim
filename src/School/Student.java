package School;

import Handlers.RandomGen;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Grade> grades;
    private Grade grade;
    private String name;
    private int alder;
    private double averageGrade;

    public Student(String name, int alder) {
        this.grades = new ArrayList<>();
        addGrades();
        this.name = name;
        this.alder = alder;
        this.averageGrade = calulateAverage();
    }






    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        this.averageGrade = averageGrade;
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
    public int calculateAverageGrades(){
         int sum = 0;
        for (Grade g: grades) {
            sum += g.getScore();
        }

        return sum / 6;
    }
    public double calulateAverage(){
        return grades.stream()
                .mapToInt(i -> i.getScore())
                .average().getAsDouble();
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
