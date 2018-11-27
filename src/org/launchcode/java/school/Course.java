package org.launchcode.java.school;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {

    private String courseName;
    private int courseId;
    private ArrayList<Student> roster;

    public Course(String courseName, int courseId, ArrayList roster) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.roster = roster;


    }
}
