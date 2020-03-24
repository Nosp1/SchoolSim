package School;

import Handlers.IdGenerator;

import java.util.*;
import java.util.stream.IntStream;


/**
 *
 */
public class ClassList {
    private String name;
    private int numOfStudents;
    private List<Student> studentList;
    private double avgGrades;
    private Teacher teacher;

    public ClassList(String name) {
        this.name = name;
        studentList = new ArrayList<>();
        this.numOfStudents = 0;
        this.avgGrades = 0;
    }

    /**
     * @return numofStudents - this the number of students.
     */
    private int countNumbersOfStudent() {
        int x = 0;
        for (Student ignored : studentList) {
            x++;
            numOfStudents += x;
        }
        return numOfStudents;
    }

    /**
     * @param student - takes an instance of a student.
     */
    public void addStudentToList(Student student) {
        studentList.add(student);
        numOfStudents += 1;

    }

    public void getSpecificStudent(int studentID) {
        if (studentID <= IdGenerator.idSequence.get()) {
            int s = IntStream.range(0, studentList.size())
                    .filter(userInd -> studentList.get(userInd).getStudID() == studentID)
                    .findFirst().getAsInt();
            Student v = studentList.get(s);
            System.out.println(v.getName());
        } else {
            System.out.println("There is no student with the id " + studentID);

        }
    }

    public void printSortedGrades() {
        for (Student s : studentList) {
            s.getGradesSorted();
            for (Grade i : s.getGrades()) {
                System.out.println(i.getScore());
            }
        }
    }

    public void printAvgGradeForClass() {
        calculateGradeAvgForClass();
        System.out.println(avgGrades);
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
