package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	TopicService topicService;
	
	@RequestMapping("/findAll")
	public List<Topic> getAllTopic(String name){
		return topicService.findAll();
	}
	
	@RequestMapping("/findOne/{id}")
	public Topic getOneTopic(@PathVariable("id") String id){
		return topicService.findOne(id);
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String createTopic(@RequestBody Topic t){
			topicService.save(t);
		return "Added Success";
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public String updateTopic(@PathVariable String id , @RequestBody Topic newtopic){
		
			topicService.update(id, newtopic);
		return "Updated Success";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String deleteTopic(@PathVariable String id){
			topicService.delete(id);
		return "Delete Success";
	}

}
