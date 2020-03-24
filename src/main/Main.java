package main;

import Handlers.RandomGen;
import School.ClassList;
import School.School;
import School.Student;
import School.Teacher;
import School.SchoolsLocation;
import School.Location;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        ClassList classList = new ClassList("A"); //generates class
        ClassList classList1 = new ClassList("B");
        generateStudents(classList); //generates random students
        generateStudents(classList1);

        School school = new School("Uia");
        classList.add(classList);
        school.classLists.add(classList1);
        school.printAllStudentsAndGrades();
        SchoolsLocation schoolsLocation = new SchoolsLocation();
        schoolsLocation.addlocation(school, new Location("Norway",RandomGen.getRandomCity()));

        for (Student e : classList.getStudentList()) {
            System.out.println("Id for: " + e.getName() + " is " + e.getStudID());
        }
        classList.getSpecificStudent(8);
        classList.printAvgGradeForClass();
        classList1.printAvgGradeForClass();


        Teacher teacher = new Teacher(RandomGen.getRandomName(), RandomGen.getRandomAge());
        System.out.println(teacher.getAlder());
        for (String  e : teacher.getCourseList()) {
            System.out.println(e);

        }
    }


    private static void generateStudents(ClassList classList) {
        for (int g = 0; g < RandomGen.getRandomNumOfStudents(); g++) {
            classList.addStudentToList(new Student(RandomGen.getRandomName(), RandomGen.getRandomAge()));
        }
    }




}
