package com.prashant.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "Run 10km on track daily :)";
    }
}
