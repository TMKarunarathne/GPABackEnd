package com.gpacalculator.gpabackend.repository;

import com.gpacalculator.gpabackend.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, String> {
}
