package com.model;
import java.util.List;


public class Student extends BaseModel{
    private String classPosition;
    private Boolean cheatedInClass;
    private List<Course> listOfCours;
    public Student() {
    }
    public Student(String classPosition, Boolean cheatedInClass, List<Course> listOfCours) {
        this.classPosition = classPosition;
        this.cheatedInClass = cheatedInClass;
        this.listOfCours = listOfCours;
    }
    public Student(String firstName, String lastName, int age, String classPosition, Boolean cheatedInClass, List<Course> listOfCours) {
        super(firstName, lastName, age);
        this.classPosition = classPosition;
        this.cheatedInClass = cheatedInClass;
        this.listOfCours = listOfCours;
    }
    public String getClassPosition() {
        return classPosition;
    }
    public void setClassPosition(String classPosition) {
        this.classPosition = classPosition;
    }
    public Boolean getCheatedInClass() {
        return cheatedInClass;
    }
    public void setCheatedInClass(Boolean cheatedInClass) {
        this.cheatedInClass = cheatedInClass;
    }
    public List<Course> getListOfCourses() {
        return listOfCours;
    }
    public void setListOfCourses(List<Course> listOfCours) {
        this.listOfCours = listOfCours;
    }
    @Override
    public String toString() {
        return "Student{\n" +
                "classPosition='" + classPosition + '\'' +
                "\n, cheatedInClass=" + cheatedInClass +
                "\n, listOfCourses=" + listOfCours +
                '}';
    }
}