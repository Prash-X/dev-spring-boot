package com.prashant.springcoredemo.rest;

import com.prashant.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{
    //define a private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    //Qualifier has higher priority if it is used in controller
    //Qualifier is preffered
    @Autowired
    public void DemoController(
            @Qualifier("baseballCoach") Coach theCoach,
            @Qualifier("baseballCoach") Coach theanotherCoach)
    {
        System.out.println("In constructor: "+ getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theanotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyworkout()
    {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check()
    {
        return "Comparing beans: myCoach == anotherCoach, "+(myCoach == anotherCoach);
    }
}
