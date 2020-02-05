package com.chmykhun.springlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class MusicPlayer {

    private List<Music> musicCollection;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    public MusicPlayer(List<Music> musicCollection) {
        this.musicCollection = musicCollection;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playAllSongs() {
        Collections.shuffle(musicCollection);
        musicCollection.forEach(this::playSong);
    }

    public void playSong(Music music) {
        System.out.println("Playing: " + music.getSong() + " (singer: " + getName() + ", volume: " + getVolume() + ")");
    }
}
