package com.gpacalculator.gpabackend.service;

import com.gpacalculator.gpabackend.model.Grade;
import com.gpacalculator.gpabackend.repository.GradeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class GradeService {
    @Autowired
    private GradeRepo gradeRepo;
    public Grade saveGrade(Grade grade){
        return gradeRepo.save(grade);
    }

    public Optional<Grade> getGradeById(String grade) {
        return gradeRepo.findById(grade);
    }

    public List<Grade> getAllGrade(){
        return gradeRepo.findAll(Sort.by(Sort.Direction.DESC, "grade"));
    }

    public Grade updateGrade(String gradeCode, Grade grade){
        Grade gradeToUpdate = gradeRepo.findById(gradeCode).orElseThrow();
        gradeToUpdate.setGrade(grade.getGrade());
        gradeToUpdate.setGpa(grade.getGpa());
        return gradeRepo.save(gradeToUpdate);
    }

    public void deleteGrade(String grade){
        gradeRepo.deleteById(grade);
    }

}
