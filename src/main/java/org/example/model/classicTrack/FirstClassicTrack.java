package org.example.model.classicTrack;


import org.example.model.MusicTrack;

public class FirstClassicTrack implements MusicTrack {

    String nameTrack = "Ноктюрн 2";
    String author = "Шопен";

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
        return "FirstClassicTrack{" +
                "nameTrack='" + nameTrack + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
