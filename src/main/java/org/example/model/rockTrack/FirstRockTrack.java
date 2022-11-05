package org.example.model.rockTrack;


import org.example.model.MusicTrack;

public class FirstRockTrack implements MusicTrack {

    String nameTrack = "Nothing else matters";
    String author = "Metallica";

    public String getNameTrack() {
        return nameTrack;
    }

    public void setNameTrack(String nameTrack) {
        this.nameTrack = nameTrack;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "FirstRockTrack{" +
                "nameTrack='" + nameTrack + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
