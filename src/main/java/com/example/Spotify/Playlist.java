package com.example.Spotify;

public class Playlist {
    private String title;

    public Playlist(){

    }

    public Playlist(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
