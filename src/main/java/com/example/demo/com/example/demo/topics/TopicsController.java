package com.example.demo.com.example.demo.topics;

import org.springframework.web.bind.annotation.*;

@RestController //it means you can map url requests to particular methods in this class
public class TopicsController {

    private TopicService topicService;

    public TopicsController(TopicService topicService) {
        this.topicService = topicService;
    }

    @RequestMapping("/topics") // takes the url that need to map to this function, works for GET requests only
    public Iterable<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable Long id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable Long id) {
        topicService.deleteTopic(id);
    }
}
