package com.springboot.demo.mycoolapp.controller;

import com.springboot.demo.mycoolapp.interfaces.Coach;
import com.springboot.demo.mycoolapp.interfaces.CricketCoach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coach")
public class CoachController {

    Logger log = LoggerFactory.getLogger(CoachController.class);


    private Coach myCoach;

    private Coach myCoach2;

    private Coach myCoach3;

    private CricketCoach cricketCoach;




//    constructor injection
// use constructor injection when required dependencies.
// When using @Qualifier annotation, the value of the annotation must be the same as the name of the bean.
// first letter in small caps
// if you don't want to use @Qualifier annotation. just specify @Primary over the @Component annotation. so that
// if @Qualifier annotation is not used, the by default @Primary annotation will be used.
// CoachController(@Qualifier("footBallCoachImplementation") Coach myCoach)

    @Autowired
    public CoachController(@Qualifier("footBallCoachImplementation") Coach myCoach,
                           @Qualifier("footBallCoachImplementation") Coach myCoach2,
                           @Qualifier("swimCoachImplementation") Coach myCoach3) {
        this.myCoach = myCoach;
        this.myCoach2 = myCoach2;
        this.myCoach3 = myCoach3;
    }



// Setter injection
// use setter injection when optional dependencies.
    @Autowired
    public void setCricketCoach(CricketCoach cricketCoach) {
        this.cricketCoach = cricketCoach;
    }

    @GetMapping(value = "/getDailyWorkout")
    public String getDailyWorkout() {
        log.info("Get Daily Workout");
        return myCoach.getDailyWorkout();
    }

    @GetMapping(value = "/getCricketCoach")
    public String getTeam() {
        return cricketCoach.getTeam();
    }

    @GetMapping(value = "/getCoach")
    public String getCoach() {
        return "Both Coaches  Scopes " +  (myCoach==myCoach2);
    }
}
