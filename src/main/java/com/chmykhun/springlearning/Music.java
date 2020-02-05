package com.chmykhun.springlearning;

import java.util.List;
import java.util.Random;

public abstract class Music {

    private static final Random RANDOM = new Random();

    private List<String> songs;

    public String getSong() {
        return songs.get(RANDOM.nextInt(songs.size())) + " (" + getClass().getSimpleName() + ")";
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
