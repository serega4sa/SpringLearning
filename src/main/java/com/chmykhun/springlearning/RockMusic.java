package com.chmykhun.springlearning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RockMusic extends Music {

    @Value("#{'${rock.music}'.split(';')}")
    @Override
    public void setSongs(List<String> songs) {
        super.setSongs(songs);
    }
}
