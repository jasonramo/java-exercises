package org.launchcode.java.school;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private int courseCredits;
    private ArrayList<Student> roster;

    public Course(String courseName, int courseCredits, ArrayList roster) {
        this.courseName = courseName;
        this.courseCredits = courseCredits;
        this.roster = roster;

        Student jason = new Student();
        roster.add(jason);

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(int courseCredits) {
        this.courseCredits = courseCredits;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public void setRoster(ArrayList<Student> roster) {
        this.roster = roster;
    }

    public String toString() {
        return ("Course Name: " + courseName + ", Credits: " + courseCredits + "Roster: " + roster);
    }

    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != getClass()) {
            return false;
        }

        return ((Course) o).getCourseName() == getCourseName();
    }

}
