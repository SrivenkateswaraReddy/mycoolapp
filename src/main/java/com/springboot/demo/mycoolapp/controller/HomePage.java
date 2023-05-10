package com.springboot.demo.mycoolapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

    // expose "/" that return "Hello World"

    Logger log = LoggerFactory.getLogger(HomePage.class);

//    @GetMapping("/")
//    public String sayHello() {
//        log.info(" from Hello World base page");
//        return "HelloWorld";
//    }

    // expose a new endpoint for workout

    @GetMapping("/workout")
    public String getDailyWorkout() {
        log.info(" from Daily Workout base page");
        return "Run a hard 5k";
    }

    // exposing new endpoint for fortune
    @GetMapping("/fortune")
    public String getDailyFortune() {
        log.info(" from Fortune base page");
        return "Today is your lucky Day";
    }

    // exposing new @values coach
    @Value("${coach.name}")
    private String coachName;
    @Value("${player.name}")
    private String playerName;


    @GetMapping("/coach")
    public String getCoachName() {
        log.info(" from Coach base page");
        return coachName;
    }

    @GetMapping("/player")
    public String getPlayerName() {
        log.info(" from Player base page");
        return playerName;
    }
}
