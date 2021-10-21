package com.model;
import java.util.ArrayList;
public class Course {
    private String courseName;
    private int creditUnit;
    public Course() {
    }
    public Course(String courseName, int creditUnit) {
        this.courseName = courseName;
        this.creditUnit = creditUnit;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getCreditUnit() {
        return creditUnit;
    }
    public void setCreditUnit(int creditUnit) {
        this.creditUnit = creditUnit;
    }
    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                ", creditUnit=" + creditUnit +
                '}';
    }
}