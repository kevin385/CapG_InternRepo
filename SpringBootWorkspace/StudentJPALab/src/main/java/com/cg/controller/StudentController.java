package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Student;
import com.cg.service.StudentServiceI;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	StudentServiceI studentService;
	
	@PostMapping(value="/addStudent")
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
		return new ResponseEntity<String>("Student added successfully", HttpStatus.OK);
	}
	
	@GetMapping(value="/getAllStudents")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@GetMapping(value="/getById/{id}")
	public Student getById(@PathVariable int id) {
		return studentService.getById(id);
	}
	
	@DeleteMapping(value="/deleteById/{id}")
	public String deleteById(@PathVariable int id) {
		studentService.deleteById(id);
		return "Deleted Successfully";
	}
}
