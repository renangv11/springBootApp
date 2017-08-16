package br.com.Courses.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topicList = new ArrayList<>(Arrays.asList(new Topic("1", "Java", "It is a good java course"),
			new Topic("2", "Javascript", "It is a good javascript course")));

	public List<Topic> getAllTopics() {
		return topicList;
	}

	public Topic getTopic(String id) {
		return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topicList.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for (int i = 0; i < topicList.size(); i++) {
			if (topicList.get(i).getId().equals(id)) {
				topicList.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		for(Topic topic : topicList){
			if(topic.getId().equals(id)){
				topicList.remove(topic);
				return;
			}
		}
	}

}
