package com.gpacalculator.gpabackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Subject {
    @Id
    private String subjectCode;
    private String name;
    private int credit;

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
