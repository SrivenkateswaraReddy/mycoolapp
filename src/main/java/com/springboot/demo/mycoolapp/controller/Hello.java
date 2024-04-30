package com.springboot.demo.mycoolapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class Hello {

    Logger log = LoggerFactory.getLogger(Hello.class);

    @GetMapping("/sayHello")
    public ResponseEntity<String> sayHello(){
        log.info("currently in hello method");
        return new ResponseEntity<String>("Hello", HttpStatus.OK);
    }
}
