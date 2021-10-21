package com.model;


public class Staffs extends BaseModel{
    private String position;
    public Staffs(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
}