package edu.cpcc.finalproject.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;

public class TaskService {
	
	
	
	Task Repository taskRepository;
	
@Autowired
public TaskService(TaskRepository taskRepository) {
	this.taskRepository = taskRepository;
	
}
	
public List<Task> get(){
	return this.taskRepository.findAll();
	
}
	
	
}
