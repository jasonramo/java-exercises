package org.launchcode.java.school;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student() {

    }

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0.0)
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public void addGrade(int courseCredits, double grade) {
        //TODO - update the appropriate fields: numberofcredits, gpa ????
        if (grade >= 90.0){
            grade = 4.0;
        }else if (90.0 > grade && grade >= 80.0) {
            grade = 3.0;
        }else if (80.0 > grade && grade >= 70.0) {
            grade = 2.0;
        }else if (70.0> grade && grade >= 60.0) {
            grade = 1.0;
        }else {
            grade = 0.0;
        }

        this.gpa = ((this.gpa * this.numberOfCredits) + (grade * courseCredits)) / (this.numberOfCredits + courseCredits)
    }

    public String getGradeLevel() {

        if(this.numberOfCredits < 30) {
            return "Freshman";
        } else if(this.numberOfCredits < 60) {
            return "Sophomore";
        } else if(this.numberOfCredits < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

    public boolean equals(Object o) {
        return  ((Student) o).getStudentId() == getStudentId();
    }

    public String getName() {
        return name;  // could be written as -- return this.name;
    }

    public void setName(String aName) {
        name = aName;  // could be written as -- this.name = name
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double aGpa) {
        gpa = aGpa;
    }
}
