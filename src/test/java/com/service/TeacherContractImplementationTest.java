package com.service;

import com.model.Course;
import com.model.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeacherContractImplementationTest {



    @BeforeEach
    void setUp() {


    }

    @Test
    @DisplayName("Should check if a Teacher can Teach a Course")

    void canTeachACourse() {


        TeacherContractImplementation teacherContractImplementation = new TeacherContractImplementation();

        Teacher teacher = new Teacher("Modupe","Adewumi",35,9);

        final String expectedResult = "You can Teach a Course";

        //when we call the method

        String actualResult = teacherContractImplementation.canTeachACourse(teacher);

        //then let us assert if expectedResult == actualResult

        assertEquals(expectedResult, actualResult);

    }
}