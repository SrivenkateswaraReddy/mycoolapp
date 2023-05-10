package com.springboot.demo.mycoolapp.InterfaceImplementation;

import com.springboot.demo.mycoolapp.interfaces.CricketCoach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoachImplementation  implements CricketCoach {
    @Override
    public String getTeam() {
        return "Returns Cricket Coach";
    }
}
