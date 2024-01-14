package com.gpacalculator.gpabackend.controller;

import com.gpacalculator.gpabackend.model.Subject;
import com.gpacalculator.gpabackend.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/subject")
@CrossOrigin("*")

public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    //    by using Post request, save a subject
    @PostMapping
    public Subject saveSubject(@RequestBody Subject subject){
        return subjectService.saveSubject(subject);
    }

    //    By using Get request, get information of all subject
    @GetMapping
    public List<Subject> getAllSubject(){
        return subjectService.getAllSubject();
    }
    //    By using Get request, get information of a subject by giving subject Code
    @GetMapping("/{subjectCode}")
    public Optional<Subject> getEmployeeById(@PathVariable String subjectCode){
        return subjectService.getSubjectById(subjectCode);
    }

    //  By using Pet Request, update information of a subject by giving subject Code
    @PutMapping("/{subjectCode}")
    public Subject updateSubject(@PathVariable String subjectCode, @RequestBody Subject subject){
        return subjectService.updateSubject(subjectCode, subject);
    }

    @DeleteMapping("/{subjectCode}")
    public void deleteSubject(@PathVariable String subjectCode){
        subjectService.deleteSubject(subjectCode);
    }
}
