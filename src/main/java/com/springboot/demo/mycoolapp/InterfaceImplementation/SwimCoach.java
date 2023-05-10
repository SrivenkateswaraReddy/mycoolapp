package com.springboot.demo.mycoolapp.InterfaceImplementation;

import com.springboot.demo.mycoolapp.interfaces.Coach;

public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice Swimming everyday";
    }
}
