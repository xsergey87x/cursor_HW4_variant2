package org.example;

import org.example.service.ClassicPlayer;
import org.example.service.RockPlayer;
import org.example.utils.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args)

    {
        AnnotationConfigApplicationContext contextApplicationSpring = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        ClassicPlayer classicPlayer = contextApplicationSpring.getBean(ClassicPlayer.class);
        RockPlayer rockPlayer = contextApplicationSpring.getBean(RockPlayer.class);

        classicPlayer.playTrack(1);
    }

}