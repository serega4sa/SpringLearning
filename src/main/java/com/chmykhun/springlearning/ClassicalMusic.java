package com.chmykhun.springlearning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Component
public class ClassicalMusic extends Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic getInstance() {
        return new ClassicalMusic();
    }

    @Value("#{'${classical.music}'.split(';')}")
    @Override
    public void setSongs(List<String> songs) {
        super.setSongs(songs);
    }

    @PostConstruct
    public void doInit() {
        System.out.println("[ClassicalMusic] Initialization");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("[ClassicalMusic] Destroy");
    }
}
