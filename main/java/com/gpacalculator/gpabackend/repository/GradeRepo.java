package com.gpacalculator.gpabackend.repository;

import com.gpacalculator.gpabackend.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepo extends JpaRepository<Grade, String> {
}
