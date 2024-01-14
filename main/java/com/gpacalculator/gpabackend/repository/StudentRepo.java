package com.gpacalculator.gpabackend.repository;

import com.gpacalculator.gpabackend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student , String> {
}
