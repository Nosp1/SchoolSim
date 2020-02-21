package main;

import Handlers.RandomGen;
import School.ClassList;
import School.School;
import School.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ClassList classList = new ClassList("A"); //generates class
        ClassList classList1 = new ClassList("B");
        generateStudents(classList);
        generateStudents(classList1);
        classList.calculateGradeAvgForClass();
        System.out.println( classList.getAvgGrades());
        classList1.calculateGradeAvgForClass();
        School school = new School("Uia");
        school.classLists.add(classList);
        school.classLists.add(classList1);
        school.printAllStudentsAndGrades();
        System.out.println(classList1.getAvgGrades());
        System.out.println(classList.getAvgGrades());


    }

    private static void generateStudents(ClassList classList) {
        for (int g = 0; g < RandomGen.getRandomNumOfStudents(); g++) {
            classList.addStudentToList(new Student(RandomGen.getRandomName(), RandomGen.getRandomAge()));
        }
    }


}
