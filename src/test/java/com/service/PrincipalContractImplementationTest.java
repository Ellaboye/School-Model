package com.service;

import com.model.Applicant;
import com.model.Course;
import com.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalContractImplementationTest {

   private PrincipalContractImplementation principalContractImplementation;

    @BeforeEach
    void setUp() {
        principalContractImplementation = new PrincipalContractImplementation();

    }

    @Test
    @DisplayName("Should Test for expelStudent functionality")
    void expelStudent() {

        //Given

        Course chemistry = new Course("Chemistry", 3);
        Course maths = new Course("Maths", 3);
        Course english = new Course("English", 3);
        Course physics = new Course("Physics", 3);

        List<Course> courseList = new ArrayList<>();
        courseList.add(chemistry);
        courseList.add(maths);
        courseList.add(english);
        courseList.add(physics);

        Student student = new Student("Nancy", "ajibobo", 24, "first class", true, courseList);

        final String expectedResult = "You cheated, You've being Expelled";

        //when we call the method


        String actualResult = principalContractImplementation.expelStudent(student);

        //then let us assert if expectedResult == actualResult

        assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("Should check if applicant passed the cut-off mark to be eligible for admission")
    void admitApplicant() {
        //given
       Applicant applicant = new Applicant("Paul","Enoch",25,75);

       final String expectedResult = "Congratulations you've been admitted";

       //when we call the method


        final String actualResult = principalContractImplementation.admitApplicant(applicant);

        assertEquals(expectedResult, actualResult);


        Applicant applicant1 = new Applicant("Temitope","Ibitoye",23,60);

        final String expectedResult1 = "Your score "+applicant.getScore()+", is low, Try again";

        final String actualResult1 = principalContractImplementation.admitApplicant(applicant);


    }
}