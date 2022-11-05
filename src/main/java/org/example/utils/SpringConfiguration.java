package org.example.utils;

import org.example.service.ClassicPlayer;
import org.example.model.classicTrack.FirstClassicTrack;
import org.example.model.classicTrack.SecondClassicTrack;
import org.example.service.RockPlayer;
import org.example.model.rockTrack.FirstRockTrack;
import org.example.model.rockTrack.SecondRockTrack;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    FirstClassicTrack firstClassicTrack()
    {
        FirstClassicTrack firstClassicTrack = new FirstClassicTrack();
        return firstClassicTrack;
    }

    @Bean
    SecondClassicTrack secondClassicTrack()
    {
        SecondClassicTrack secondClassicTrack = new SecondClassicTrack();
        return secondClassicTrack;
    }

    @Bean
    FirstRockTrack firstRockTrack()
    {
        FirstRockTrack firstRockTrack = new FirstRockTrack();
        return firstRockTrack;
    }

    @Bean
    SecondRockTrack secondRockTrack()
    {
        SecondRockTrack secondRockTrack = new SecondRockTrack();
        return secondRockTrack;
    }

    @Bean
    RockPlayer rockPlayer(AnnotationConfigApplicationContext context)
    {
        RockPlayer rockPlayer = new RockPlayer();

        rockPlayer.addTrackToList(context);
        return rockPlayer;
    }

    @Bean
    ClassicPlayer classicPlayer(AnnotationConfigApplicationContext context)
    {
        ClassicPlayer classicPlayer = new ClassicPlayer();
        classicPlayer.addTrackToList(context);
        return classicPlayer;
    }

}
