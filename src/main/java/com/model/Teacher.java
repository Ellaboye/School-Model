package com.model;

public class Teacher extends BaseModel {
    private int yearsOfExperience;

    public Teacher(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Teacher(String firstName, String lastName, int age, int yearsOfExperience) {
        super(firstName, lastName, age);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }



    /*public String admitApplicant(Applicant applicant) {
    if (applicant.getScore() > 70) {
        return "Congratulations you've been admitted";
    }
    return "Your score "+applicant.getScore()+", is low, Try again";
}*/

}