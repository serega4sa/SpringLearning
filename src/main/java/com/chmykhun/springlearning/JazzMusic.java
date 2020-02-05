package com.chmykhun.springlearning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JazzMusic extends Music {

    @Override
    @Value("#{'${jazz.music}'.split(';')}")
    public void setSongs(List<String> songs) {
        super.setSongs(songs);
    }
}
