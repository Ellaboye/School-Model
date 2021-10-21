package com;

import com.model.Applicant;
import com.model.Course;
import com.model.Student;
import com.service.PrincipalContractImplementation;

import java.util.ArrayList;
import java.util.List;

public class SchoolApp {
    public static void main(String[] args){


        Course chemistry = new Course("Chemistry", 3);
        Course maths = new Course("Maths", 3);
        Course english = new Course("English", 3);
        Course physics = new Course("Physics", 3);

        List<Course> courseList = new ArrayList<>();
        courseList.add(chemistry);
        courseList.add(maths);
        courseList.add(english);
        courseList.add(physics);

        Student student = new Student("mercy","ajibobo",24,"first class",true, courseList);
        Applicant applicant = new Applicant("Stella","Ajibobo",25,78);

        PrincipalContractImplementation principal = new PrincipalContractImplementation();

        System.out.println();
        System.out.println(principal.expelStudent(student));
        System.out.println();
        System.out.println(principal.admitApplicant(applicant));
        System.out.println();
//            student.getListOfCourses().stream().map(x -> x.getCourseName()).forEach(System.out::println);

    }
}