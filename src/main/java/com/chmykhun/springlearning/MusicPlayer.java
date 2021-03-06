package com.chmykhun.springlearning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Component
public class MusicPlayer {

    public enum MusicType {
        CLASSICAL, JAZZ, ROCK
    }

    private Map<MusicType, Music> musicCollection;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(Map<MusicType, Music> musicCollection) {
        this.musicCollection = musicCollection;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {
        System.out.println("===Playing songs of different types===");
        List<Music> allSongs = new ArrayList<>(musicCollection.values());
        Collections.shuffle(allSongs);
        allSongs.forEach(this::playSong);
    }

    public void playMusic(MusicType musicType) {
        System.out.println("===Playing song of predefined type (" + musicType.name() + ")===");
        playSong(musicCollection.get(musicType));
    }

    private void playSong(Music music) {
        System.out.println("Playing: " + music.getSong() + " (singer: " + getName() + ", volume: " + getVolume() + ")");
    }
}
