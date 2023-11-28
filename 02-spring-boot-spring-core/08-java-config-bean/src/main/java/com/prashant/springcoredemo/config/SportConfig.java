package com.prashant.springcoredemo.config;


import com.prashant.springcoredemo.common.Coach;
import com.prashant.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig
{
    @Bean("acquatic")
    public Coach swimCoach()
    {
        return new SwimCoach();
    }
}
