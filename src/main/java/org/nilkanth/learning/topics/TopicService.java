package org.nilkanth.learning.topics;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring Boot is easy to start framework"),
			new Topic("Struts", "Struts Framework", "Struts is easy to start framework"),
			new Topic("JavaScript", "JavaScript Framework", "JavaScript is easy to start framework")
			));
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		topicRepository.save(topic);		
	}

	public void deleteId(String Id) {		
		topicRepository.delete(Id);
	}
}