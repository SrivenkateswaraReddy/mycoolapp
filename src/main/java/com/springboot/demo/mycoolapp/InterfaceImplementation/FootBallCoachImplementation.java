package com.springboot.demo.mycoolapp.InterfaceImplementation;

import com.springboot.demo.mycoolapp.interfaces.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Primary -- if not mentioned specifically go with the @primary annotation
//@Lazy -- it will make sure that the bean is created only when required.
//@Eager -- it will make sure that the bean is created even when not required.
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) -- it will make sure that the bean scope is prototype. and each will get new instance.
//by default, it will create a singleton bean. if you want anything else we need to explicitly declare it as a bean.

// we can also have post-construct and pre-destroy methods.
//@PostConstruct post-construct will be called after the bean is created.
// pre-destroy will be called before the bean is destroyed.
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class FootBallCoachImplementation implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Try working on the footsteps";
    }

    @PostConstruct
    public String myPostConstruct() {
        System.out.println("FootBallCoachImplementation.myPostConstruct()");
        return "FootBallCoachImplementation.myPostConstruct()";
    }

    @PreDestroy
    public String myPreDestroy() {
        System.out.println("FootBallCoachImplementation.myPreDestroy()");
        return "FootBallCoachImplementation.myPreDestroy()";
    }
}
