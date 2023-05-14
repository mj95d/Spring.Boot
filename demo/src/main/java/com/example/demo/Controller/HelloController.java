package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping(path ="/get ")
    public String helloWord() {
        return "Hello Word";
    }
@GetMapping(path = "/Name")
    public String getName(){
        return "My Name is Abdulmajeed";


    }
@GetMapping(path = "/Age")
    public String getAge(){
        return "My Age is : " + 100;

    }
@GetMapping(path = "/chack")
public String getchach(){
        return "Everything OK";



}
@GetMapping(path = "/health")
public String gethealth(){
        return "Server health is up and running";
    }

}
