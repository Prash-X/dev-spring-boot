package com.prashant.springcoredemo.common;


public class SwimCoach implements Coach
{
    public SwimCoach()
    {
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout()
    {
        return "Swim 10000 meters as a warm up";
    }
}
