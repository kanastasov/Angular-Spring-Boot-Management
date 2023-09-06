package com.kirilanastasoff.managements.studentmanager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kirilanastasoff.managements.studentmanager.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	void deleteStudentById(Long id);

	Optional<Student> findStudentById(Long id);
}
