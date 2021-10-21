package com.service;
import com.interfaces.PrincipalContract;
import com.model.Applicant;
import com.model.Student;

public class PrincipalContractImplementation implements PrincipalContract {


    @Override
    public String expelStudent(Student student) {
        if(student.getCheatedInClass() == true) {
            return "You cheated, You've being Expelled";
        }
        return "Good Conduct, You've not being expelled";
    }
    @Override
    public String admitApplicant(Applicant applicant) {
        if (applicant.getScore() > 70) {
            return "Congratulations you've been admitted";
        }
        return "Your score "+applicant.getScore()+", is low, Try again";
    }
}