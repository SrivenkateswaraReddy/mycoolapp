package com.springboot.demo.mycoolapp.InterfaceImplementation;

import com.springboot.demo.mycoolapp.interfaces.Coach;
import org.springframework.stereotype.Component;

//@Primary


@Component
public class CoachImplementation  implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Implement cricket Coach";
    }
}
