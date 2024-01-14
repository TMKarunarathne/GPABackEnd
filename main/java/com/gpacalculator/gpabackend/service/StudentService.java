package com.gpacalculator.gpabackend.service;

import com.gpacalculator.gpabackend.model.Student;
import com.gpacalculator.gpabackend.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;
    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }

    public Optional<Student> getStudentById(String studentID) {
        return studentRepo.findById(studentID);
    }

    public List<Student> getAllStudent(){
        return studentRepo.findAll(Sort.by(Sort.Direction.DESC, "studentID"));
    }

    public Student updateStudent(String studentID, Student student){
        Student studentToUpdate = studentRepo.findById(studentID).orElseThrow();
        studentToUpdate.setAddress(student.getAddress());
        studentToUpdate.setEmail(student.getEmail());
        studentToUpdate.setContactNumber(student.getContactNumber());
        studentToUpdate.setFirstName(student.getFirstName());
        studentToUpdate.setLastName(student.getLastName());
        return studentRepo.save(studentToUpdate);
    }

    public void deleteStudent(String studentID){
        studentRepo.deleteById(studentID);
    }

}
