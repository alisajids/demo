package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topicsList = new ArrayList<>( Arrays.asList(
		      new Topic("JAVA","Core Java","Core java description"),
		      new Topic("Spring","Core Spring","Core spring description"),
		      new Topic("JAVAScript","JAVA Script","JAVA Script description")
			));
	
	public List<Topic> findAll(){
		return topicsList;
	}
	
	public Topic findOne(String id){
		return topicsList.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	
	public void save(Topic t){
		topicsList.add(t);
	}
	public void update(String id,Topic newtopic){
		Topic existing = topicsList.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
		existing.setId(newtopic.getId());
		existing.setName(newtopic.getName());
		existing.setDescription(newtopic.getDescription());
	}
	
	public void delete(String id){
		Topic topic = topicsList.stream().filter(t->t.getId().equals(id)).findFirst().get();
		topicsList.remove(topic);
	}
}
