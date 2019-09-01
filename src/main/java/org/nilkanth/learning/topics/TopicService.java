package org.nilkanth.learning.topics;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring Boot is easy to start framework"),
			new Topic("Struts", "Struts Framework", "Struts is easy to start framework"),
			new Topic("JavaScript", "JavaScript Framework", "JavaScript is easy to start framework")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
				topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for (int i=0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
			}
		}		
	}

	public void deleteId(String Id) {		
		topics.removeIf(t -> t.getId().equals(Id));
	}
}