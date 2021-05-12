package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.cg.entity.Trainee;

@Service
public interface TraineeServiceI {
	public List<Trainee> getAllTrainees();
	
	public Trainee getByTraineeName(String name);
	
	public Trainee getByTraineeId(int id);
	
	public void deleteByTraineeId(int id);
	
	public Trainee updateTrainee(Trainee trainee);
	
	public Trainee addTrainee(Trainee trainee);
	
}
