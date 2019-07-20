package com.user.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestClass {
    public static void main(String[] args) {
        SpringApplication.run(TestClass.class,args);
    }
    @RequestMapping("/one")
    public String test(){
        return "hi 我是关甜甜";
    }
}
