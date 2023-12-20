package com.example.Java.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Java.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
