package com.github.java.spring.usman.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    @Autowired
    DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/getPersonByName")
    public Person getPersonByName(@RequestParam(value = "name", defaultValue = "usman") String name) {
        return demoService.getPersonBy(name);
    }

    @GetMapping("/getPersonByProfession")
    public Person getPersonByProfession(@RequestParam(value = "profession", defaultValue = "engineer") String profession) {
        return demoService.getPersonByProfession(profession);
    }

}
