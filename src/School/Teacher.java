package School;

import Handlers.RandomGen;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private int alder;
    private ArrayList<String> courseList;

    public Teacher(String name, int alder) {
        this.name = name;
        this.alder = alder;
        courseList = new ArrayList<>();
        addCourses();
    }

    public void addCourses() {
        for(int i = 0; i < RandomGen.Subjects.length -1; i++) {
            courseList.add(RandomGen.Subjects[i]);
        }
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

    public ArrayList<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<String> courseList) {
        this.courseList = courseList;
    }
}
