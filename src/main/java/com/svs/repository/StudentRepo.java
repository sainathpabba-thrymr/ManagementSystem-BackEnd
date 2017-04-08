package com.svs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.svs.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, String> {

}
