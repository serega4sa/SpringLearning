package com.chmykhun.springlearning;

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

    public void doInit() {
        System.out.println("[ClassicalMusic] Initialization");
    }

    public void doDestroy() {
        System.out.println("[ClassicalMusic] Destroy");
    }
}
