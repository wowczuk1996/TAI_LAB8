package com.example.demo.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello_world")
    public String helloWorld() {
        return "Hello world";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello_world_been")
    public HelloWorldBean helloWorldBeen() {
        return new HelloWorldBean("Hello World");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello_world_been/{name}")
    public HelloWorldBean helloWorldBeen(@PathVariable String name) {
        return new HelloWorldBean("Hello World "  + name);
    }
}
