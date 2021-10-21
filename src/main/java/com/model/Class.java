package com.model;


public class Class {
    private String className;
    private Integer classSize;
    private Teacher teacher;
    private Student students;
    public Class(String className, Integer classSize, Teacher teacher, Student students) {
        this.className = className;
        this.classSize = classSize;
        this.teacher = teacher;
        this.students = students;
    }
    public Class() {
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public Integer getClassSize() {
        return classSize;
    }
    public void setClassSize(Integer classSize) {
        this.classSize = classSize;
    }
    public Teacher getTeachers() {
        return teacher;
    }
    public void setTeachers(Teacher teacher) {
        this.teacher = teacher;
    }
    public Student getStudents() {
        return students;
    }
    public void setStudents(Student students) {
        this.students = students;
    }
}