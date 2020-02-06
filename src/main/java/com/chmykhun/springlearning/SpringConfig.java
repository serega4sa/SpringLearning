package com.chmykhun.springlearning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@ComponentScan("com.chmykhun.springlearning")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public MusicPlayer musicPlayer(List<Music> musicCollection) {
        Map<MusicPlayer.MusicType, Music> musicMap = new HashMap<>();
        for (MusicPlayer.MusicType type : MusicPlayer.MusicType.values()) {
            Music musicByType = getMusicByType(type, musicCollection);
            if (musicByType != null) {
                musicMap.put(type, musicByType);
            }
        }
        return new MusicPlayer(musicMap);
    }

    private Music getMusicByType(MusicPlayer.MusicType musicType, List<Music> musicCollection) {
        for (Music music : musicCollection) {
            if (music.getClass().getSimpleName().toLowerCase().contains(musicType.name().toLowerCase())) {
                return music;
            }
        }
        return null;
    }
}
