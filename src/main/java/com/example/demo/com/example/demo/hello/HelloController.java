package com.example.demo.com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //it means you can map url requests to particular methods in this class
public class HelloController {

    @RequestMapping("/hello") // takes the url that need to map to this function, works for GET requests only
    public String sayHi(){
        return "Hi";
    }
}
