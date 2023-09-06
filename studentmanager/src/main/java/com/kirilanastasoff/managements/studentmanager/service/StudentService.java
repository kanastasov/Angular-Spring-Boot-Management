package com.kirilanastasoff.managements.studentmanager.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kirilanastasoff.managements.studentmanager.exceptions.StudentNotFoundException;
import com.kirilanastasoff.managements.studentmanager.model.Student;
import com.kirilanastasoff.managements.studentmanager.repository.StudentRepository;

@Service
public class StudentService {

	private final StudentRepository repository;
	
	@Autowired
	public StudentService(StudentRepository repository) {
		this.repository = repository;
	}
	
	public Student addStudent(Student student) {
		student.setStudentCode(UUID.randomUUID().toString());
		return repository.save(student); 
	}
	
	public List<Student> findAllStudents(){
		return repository.findAll();
	}
	
	public Student updateStudents(Student student) {
		return repository.save(student);
	}
	
	public Student getStudentById(Long id) {
		return repository.findStudentById(id).orElseThrow(
				() -> new StudentNotFoundException("Student by id " + id +  " was not found") );
	}
	
	public void deleteStudent(Long id) {
		repository.deleteStudentById(id);
	}
	
}
