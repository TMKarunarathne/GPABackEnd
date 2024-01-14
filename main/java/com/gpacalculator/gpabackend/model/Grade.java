package com.gpacalculator.gpabackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Grade {

    @Id
    private String grade;
    private double gpa;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
