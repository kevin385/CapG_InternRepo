package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entity.Student;

@Service
public interface StudentServiceI {
	public Student addStudent(Student student);
	
	public List<Student> getAllStudents();
	
	public Student getById(int id);
	
	public void deleteById(int id);
}
