package School;

import java.util.ArrayList;
import java.util.List;

public class ClassList {
    private String name;
    private int numOfStudents;
    private List<Student> studentList;
    private double avgGrades;

    public ClassList(String name) {
        this.name = name;
        studentList = new ArrayList<>();
        this.numOfStudents = 0;
    }

    private int countNumbersOfStudent() {
        int x = 0;
        for (Student ignored : studentList) {
            x++;
            numOfStudents += x;
        }
        return numOfStudents;
    }

    public void addStudentToList(Student student) {
        studentList.add(student);
        numOfStudents += 1;

    }

    public double calculateGradeAvgForClass() {
        return this.avgGrades = studentList.stream()
                .mapToDouble(i -> i.getAverageGrade())
                .average().getAsDouble();

    }

    public double getAvgGrades() {
        return avgGrades;
    }

    public void setAvgGrades(double avgGrades) {
        this.avgGrades = avgGrades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
