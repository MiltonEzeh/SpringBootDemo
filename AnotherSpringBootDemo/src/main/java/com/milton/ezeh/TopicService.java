package com.milton.ezeh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

// mark class as service - Spring will register and create an instance of it
// its a singleton

@Service
public class TopicService {
	
	// remember that Arrays.asList is immutable. So use ArrayList
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
													new Topic("Java", "Java is good", "Hello Java"),
													new Topic("PHP", "PHP is crap", "Hello PHP"), 
													new Topic("JavaScript", "JS is OK", "Hello JavaScript")
													));
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		// check if id is equal to id sent and return the first occurrence
		// convert collection to a stream and iterate thru it
		// with the predicate, find the first occurrence
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
		
	}

	public void updateTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
		// loop thru all topics, compare ids, if match is found, update
		for(int i = 0; i < topics.size(); i++){
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i, topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		return;
		
	}

	

}
