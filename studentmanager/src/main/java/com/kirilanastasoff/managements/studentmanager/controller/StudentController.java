package com.kirilanastasoff.managements.studentmanager.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kirilanastasoff.managements.studentmanager.model.Student;
import com.kirilanastasoff.managements.studentmanager.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	private final StudentService ss;

	public StudentController(StudentService ss) {
		super();
		this.ss = ss;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> students = ss.findAllStudents();
		return new ResponseEntity<>(students, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id) {
		Student student = ss.getStudentById(id);
		
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		Student newStudent = ss.addStudent(student);
		return new ResponseEntity<>(newStudent, HttpStatus.CREATED);

	}
	
	@PutMapping("/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student){
		Student newStudent = ss.addStudent(student);
		return new ResponseEntity<>(newStudent, HttpStatus.OK);

	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable("id") Long id){
		 ss.deleteStudent(id);
		return new ResponseEntity<>(HttpStatus.OK);

	}


}
