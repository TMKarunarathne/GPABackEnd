package com.gpacalculator.gpabackend.controller;

import com.gpacalculator.gpabackend.model.Student;
import com.gpacalculator.gpabackend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")

public class StudentController {

    @Autowired
    private StudentService studentService; // bringing in Student Service instance

//    by using Post request, save a student
    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

//    By using Get request, get information of all student
    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
//    By using Get request, get information of a student by giving student ID
    @GetMapping("/{studentID}")
    public Optional<Student> getEmployeeById(@PathVariable String studentID){
        return studentService.getStudentById(studentID);
    }

//  By using Pet Request, update information of a student by giving student ID
    @PutMapping("/{studentID}")
    public Student updateStudent(@PathVariable String studentID, @RequestBody Student student){
        return studentService.updateStudent(studentID, student);
    }

    @DeleteMapping("/{studentID}")
    public void deleteStudent(@PathVariable String studentID){
        studentService.deleteStudent(studentID);
    }



}
