package com.gpacalculator.gpabackend.controller;

import com.gpacalculator.gpabackend.model.Grade;
import com.gpacalculator.gpabackend.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/grade")
@CrossOrigin("*")

public class GradeController {
    
    @Autowired
    private GradeService gradeService;

    //    by using Post request, save a grade
    @PostMapping
    public Grade saveGrade(@RequestBody Grade grade){
        return gradeService.saveGrade(grade);
    }

    //    By using Get request, get information of all grade
    @GetMapping
    public List<Grade> getAllGrade(){
        return gradeService.getAllGrade();
    }
    //    By using Get request, get information of a grade by giving grade
    @GetMapping("/{grade}")
    public Optional<Grade> getEmployeeById(@PathVariable String grade){
        return gradeService.getGradeById(grade);
    }

    //  By using Pet Request, update information of a grade by giving grade
    @PutMapping("/{grade}")
    public Grade updateGrade(@PathVariable String gradeName, @RequestBody Grade grade){
        return gradeService.updateGrade(gradeName, grade);
    }

    @DeleteMapping("/{grade}")
    public void deleteGrade(@PathVariable String grade){
        gradeService.deleteGrade(grade);
    }
}
