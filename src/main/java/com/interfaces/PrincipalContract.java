package com.interfaces;
import com.model.Applicant;
import com.model.Student;
public interface PrincipalContract {
    String expelStudent(Student student);
    String admitApplicant(Applicant applicant);
}