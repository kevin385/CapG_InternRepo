package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.dao.StudentDaoI;
import com.cg.entity.Student;

@Service
public class StudentServiceImpl implements StudentServiceI {

	StudentDaoI studentDao;
	
	@Override
	public Student addStudent(Student student) {
		return studentDao.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentDao.findAll();
	}

	@Override
	public Student getById(int id) {
		return studentDao.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		studentDao.deleteById(id);
	}

}
