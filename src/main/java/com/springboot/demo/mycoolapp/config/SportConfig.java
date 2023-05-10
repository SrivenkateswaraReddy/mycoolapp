package com.springboot.demo.mycoolapp.config;

import com.springboot.demo.mycoolapp.InterfaceImplementation.SwimCoach;
import com.springboot.demo.mycoolapp.interfaces.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration annotation helps to configure a custom bean .
// for example in AWS SDK we can do @Component annotation directly
// but we can create a configuration method where we can use @Bean annotation and call from configuration class
// we can even add custom bean name to the configuration.
@Configuration
public class SportConfig {

//    @Bean
    @Bean(value = "swimCoachImplementation")
    public Coach swimCoach() {
        return new SwimCoach();
    }

}
