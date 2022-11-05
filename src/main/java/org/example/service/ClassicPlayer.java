package org.example.service;

import org.example.model.MusicTrack;
import org.example.model.classicTrack.FirstClassicTrack;
import org.example.model.classicTrack.SecondClassicTrack;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class ClassicPlayer {

    ArrayList<MusicTrack> classicTrackList = new ArrayList<>();

    public void addTrackToList(AnnotationConfigApplicationContext context) {
        MusicTrack firstClassicTrack = context.getBean(FirstClassicTrack.class);
        MusicTrack secondClassicTrack = context.getBean(SecondClassicTrack.class);
        classicTrackList.add(firstClassicTrack);
        classicTrackList.add(secondClassicTrack);
    }

    public void playTrack (int numberTrack)
    {
        System.out.println("Now track number" + numberTrack + "is playing" + "Track information:  " + classicTrackList.get(numberTrack));
    }

    public ArrayList<MusicTrack> getClassicTrackList() {
        return classicTrackList;
    }

    public void setClassicTrackList(ArrayList<MusicTrack> classicTrackList) {
        this.classicTrackList = classicTrackList;
    }

    @Override
    public String toString() {
        return "ClassicPlayer{" +
                "classicTrackList=" + classicTrackList +
                '}';
    }
}
