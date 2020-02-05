package com.chmykhun.springlearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer.playMusic(MusicPlayer.MusicType.CLASSICAL);
        musicPlayer.playMusic(MusicPlayer.MusicType.JAZZ);
        musicPlayer.playMusic(MusicPlayer.MusicType.ROCK);
        context.close();
    }
}
