package com.service;

import com.interfaces.TeacherContract;
import com.model.Course;
import com.model.Teacher;

public class TeacherContractImplementation implements TeacherContract {

    @Override
    public String canTeachACourse(Teacher teacher) {
        if(teacher.getYearsOfExperience() >= 2) {
            return "You can Teach a Course";
        }
        return "You are not Eligible to Teach a Course";
    }
}