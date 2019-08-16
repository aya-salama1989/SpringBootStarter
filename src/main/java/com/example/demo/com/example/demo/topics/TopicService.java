package com.example.demo.com.example.demo.topics;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

    private TopicRepository repository;

    public TopicService(TopicRepository repository) {
        this.repository = repository;
    }

    public Iterable<Topic> getAllTopics() {
        return repository.findAll();
    }

    public Topic getTopic(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Entity not found"));
    }

    public void addTopic(Topic topic) {
        repository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
//        for (int i = 0; i < topics.size(); i++) {
//            if (topics.get(i).getId().equals(id)) {
//                topics.set(i, topic);
//                return;
//            }
//
//        }
    }

    public void deleteTopic(Long id) {
        repository.deleteById(id);
    }
}
