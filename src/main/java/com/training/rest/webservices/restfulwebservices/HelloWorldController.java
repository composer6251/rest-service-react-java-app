package com.training.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/helloworldbean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World Bean");
    }
}
