package dev.ideaport.hello.controller;

import dev.ideaport.hello.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public Message sayHello(){
        return new Message("Hello!");
    }

    @GetMapping("/{name}")
    public Message greet(@PathVariable(value = "name") String name){
        return new Message("Hello, " + name + "!");
    }
}
