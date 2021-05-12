package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.TraineeJpaRepository;
import com.cg.entity.Trainee;

@Service
public class TraineeService implements TraineeServiceI {
	
	@Autowired
	TraineeJpaRepository traineeDao;

	@Override
	public List<Trainee> getAllTrainees() {
		return traineeDao.findAll();
	}

	@Override
	public Trainee getByTraineeName(String name) {
		return traineeDao.findByTraineeName(name);
	}

	@Override
	public Trainee getByTraineeId(int id) {
		return traineeDao.findById(id).get();
	}

	@Override
	public void deleteByTraineeId(int id) {
		traineeDao.deleteById(id);
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		
		return traineeDao.save(trainee);
		
	}

	@Override
	public Trainee addTrainee(Trainee trainee) {
		return traineeDao.save(trainee);
	}
	
	
}
