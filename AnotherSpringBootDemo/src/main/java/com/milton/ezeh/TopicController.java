package com.milton.ezeh;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// converts objects to JSON on return
@RestController
public class TopicController {
	
	// inject dependency here
	@Autowired
	private TopicService topicService;

	@GetMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable("id") String id){
		return topicService.getTopic(id);
		
	}
	
	@PostMapping("/topics")
	// take payload from POST and convert into Topic instance using @RequestBody
	public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
		
	}
	
	@PutMapping("/topics/{id}")
	// take payload from PUT and convert into Topic instance using @RequestBody, also take ID of topic to change
	public void updateTopic(@RequestBody Topic topic, @PathVariable("id") String id){
		topicService.updateTopic(topic, id);
		
	}
	
	
	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@PathVariable("id") String id){
		topicService.deleteTopic(id);
		
	}
}
