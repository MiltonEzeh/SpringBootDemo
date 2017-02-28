package com.milton.ezeh;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// mark class as service - Spring will register and create an instance of it
// its a singleton

@Service
public class TopicService {
	
	// This connects to a database
	
	@Autowired
	private TopicRepository repo;

	public List<Topic> getAllTopics(){
		return (List<Topic>) repo.findAll();
	}
	
	public Topic getTopic(String id){
		return repo.findOne(id);
		
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		repo.save(topic);
		
	}

	public void updateTopic(Topic topic, String id) {
		// save can do both add (if row doesn't exist) or update (if row exists)
		repo.save(topic);
		
	}

	public void deleteTopic(String id) {
		 repo.delete(id);
		
	}

	

}
