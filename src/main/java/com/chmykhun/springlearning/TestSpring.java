package com.chmykhun.springlearning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer.playMusic(MusicPlayer.MusicType.CLASSICAL);
        musicPlayer.playMusic(MusicPlayer.MusicType.JAZZ);
        musicPlayer.playMusic(MusicPlayer.MusicType.ROCK);
        context.close();
    }
}
