package com.chmykhun.springlearning;

import java.util.Collections;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicCollection;
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    // IoC
    public MusicPlayer(List<Music> musicCollection) {
        this.musicCollection = musicCollection;
    }

    public void setMusicCollection(List<Music> musicCollection) {
        this.musicCollection = musicCollection;
    }

    public List<Music> getMusicCollection() {
        return musicCollection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playAllSongs() {
        Collections.shuffle(musicCollection);
        musicCollection.forEach(this::playSong);
    }

    public void playSong(Music music) {
        System.out.println("Playing: " + music.getSong() + " (singer: " + getName() + ", volume: " + getVolume() + ")");
    }
}
