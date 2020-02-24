package School;

import java.util.ArrayList;
import java.util.List;

public class School {
    public ArrayList<ClassList> classLists;
    public String name;
    private double avgSchoolGrade;

    public School(String name) {
        this.classLists = new ArrayList<ClassList>();
        this.name = name;
    }

    public ArrayList<ClassList> getClassLists() {
        return classLists;
    }

    public void setClassLists(ArrayList<ClassList> classLists) {
        this.classLists = classLists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calculateAvgSchoolGrades(){
        return this.classLists.stream()
                .mapToDouble(i -> i.getAvgGrades())
                .average().getAsDouble();
    }
    public double calcAvgWithFor() {
        this.avgSchoolGrade = 0;
        for (ClassList cl : classLists) {
            avgSchoolGrade += cl.getAvgGrades();
        }
        return avgSchoolGrade;
    }

    public void printAllStudentsAndGrades() {
        for (ClassList c : classLists) {
            List<Student> tempList = c.getStudentList();
            System.out.println("the number of students in class " + c.getName() + " are: " + c.getNumOfStudents());
            System.out.println("Their names are: ");
            for (Student s : tempList) {
                System.out.println(s.getName() + " who got the grades: ");
                s.printGrades();
            }
        }
    }
}
