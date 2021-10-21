package com.model;

public class Applicant extends BaseModel{
    private int score;
    public Applicant(int score) {
        this.score = score;
    }
    public Applicant(String firstName, String lastName, int age, int score) {
        super(firstName, lastName, age);
        this.score = score;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}