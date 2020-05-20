package com.training.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/helloworldbean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean ("Hello World Bean");
    }

    @GetMapping("/helloworldbean/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariableService(@PathVariable String name){
        //throw new RuntimeException("Runtime Exception in: " + this.getClass());
        return new HelloWorldBean(String.format("Hello World %s", name));
    }
}
