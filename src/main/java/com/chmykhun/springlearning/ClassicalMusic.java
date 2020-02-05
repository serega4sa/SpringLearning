package com.chmykhun.springlearning;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic getInstance() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody (Classic)";
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
