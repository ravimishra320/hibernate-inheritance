package com.devhawks.entity;

import jakarta.persistence.Entity;

@Entity
public class Student extends User{

    private String course;

    public Student(String firstName, String lastName, String email, String course) {
        super(firstName, lastName, email);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}