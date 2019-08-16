package com.example.demo.com.example.demo;

import com.example.demo.com.example.demo.topics.Topic;
import com.example.demo.com.example.demo.topics.TopicRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class Runner implements CommandLineRunner {

    private TopicRepository repository;

    public Runner(TopicRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Topic> collect = Stream.of(
                new Topic("spring frame work with java", "a tutorial describinng how bla bla"),
                new Topic("android tutorial", "bla bla tany"),
                new Topic("kotlin with android", "another bla bla")
        ).collect(Collectors.toList());

        repository.deleteAll();
        repository.saveAll(collect);

    }
}
