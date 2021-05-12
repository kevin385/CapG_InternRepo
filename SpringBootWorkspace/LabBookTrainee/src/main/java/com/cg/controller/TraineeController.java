package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.cg.entity.Trainee;
import com.cg.service.TraineeServiceI;

@RestController
@RequestMapping(value="/trainee")
public class TraineeController {
	
	@Autowired
	TraineeServiceI traineeService;
	
	@GetMapping(value="/getAllTrainees")
	public List<Trainee> getAllTrainees() {
		return traineeService.getAllTrainees();
	}
	
	@GetMapping(value="/getByTraineeName/{name}")
	public Trainee getTraineeByName(@PathVariable String name) {
		return traineeService.getByTraineeName(name);
	}
	
	@GetMapping(value="/getByTraineeId/{id}")
	public Trainee getTraineeById(@PathVariable int id) {
		return traineeService.getByTraineeId(id);
	}
	
	@DeleteMapping(value="/deleteTraineeById/{id}")
	public ResponseEntity<String> deleteByTraineeId(@PathVariable int id) {
		traineeService.deleteByTraineeId(id);
		return new ResponseEntity<String>("Successfully Deleted", HttpStatus.OK);
	}
	
	@PutMapping(value="/updateTrainee")
	public ResponseEntity<String> updateTrainee(@RequestBody Trainee trainee) {
		traineeService.updateTrainee(trainee);
		return new ResponseEntity<String>("Successfully Updated", HttpStatus.OK);
	}
	
	@PostMapping(value="/addTrainee")
	public ResponseEntity<String> addTrainee(@RequestBody Trainee trainee) {
		traineeService.addTrainee(trainee);
		return new ResponseEntity<String>("Successfully Added", HttpStatus.OK);
	}
	
}
