package com.gpacalculator.gpabackend.service;

import com.gpacalculator.gpabackend.model.Subject;
import com.gpacalculator.gpabackend.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepo subjectRepo;
    public Subject saveSubject(Subject subject){
        return subjectRepo.save(subject);
    }

    public Optional<Subject> getSubjectById(String subjectCode) {
        return subjectRepo.findById(subjectCode);
    }

    public List<Subject> getAllSubject(){
        return subjectRepo.findAll(Sort.by(Sort.Direction.DESC, "subjectCode"));
    }

    public Subject updateSubject(String subjectCode, Subject subject){
        Subject subjectToUpdate = subjectRepo.findById(subjectCode).orElseThrow();
        subjectToUpdate.setName(subject.getName());
        subjectToUpdate.setCredit(subject.getCredit());
        return subjectRepo.save(subjectToUpdate);
    }

    public void deleteSubject(String subjectCode){
        subjectRepo.deleteById(subjectCode);
    }

}
