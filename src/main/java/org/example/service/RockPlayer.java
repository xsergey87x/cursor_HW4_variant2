package org.example.service;

import org.example.model.MusicTrack;
import org.example.model.rockTrack.FirstRockTrack;
import org.example.model.rockTrack.SecondRockTrack;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class RockPlayer {

    ArrayList<MusicTrack> rockTrackList = new ArrayList<>();

    public void addTrackToList(AnnotationConfigApplicationContext context) {
        MusicTrack firstRockTrack = context.getBean(FirstRockTrack.class);
        MusicTrack secondRockTrack = context.getBean(SecondRockTrack.class);
        rockTrackList.add(firstRockTrack);
        rockTrackList.add(secondRockTrack);
    }

    public void playTrack (int numberTrack)
    {
        System.out.println("Now track number" + numberTrack + "is playing" + "Track information:  " + rockTrackList.get(numberTrack));
    }

    public ArrayList<MusicTrack> getRockTrackList() {
        return rockTrackList;
    }

    public void setRockTrackList(ArrayList<MusicTrack> rockTrackList) {
        this.rockTrackList = rockTrackList;
    }

    @Override
    public String toString() {
        return "RockPlayer{" +
                "rockTrackList=" + rockTrackList +
                '}';
    }
}
