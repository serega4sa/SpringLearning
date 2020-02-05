package com.chmykhun.springlearning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JazzMusic extends Music {

    @Value("#{'${jazz.music}'.split(';')}")
    @Override
    public void setSongs(List<String> songs) {
        super.setSongs(songs);
    }
}
