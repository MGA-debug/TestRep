package ru.appline.gordeev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gordeev-ma 26.06.2022
 **/
@Component
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    @Autowired
    @Qualifier("classicalMusic")
    private Music music1;
    @Autowired
    @Qualifier("rockMusic")
    private Music music2;

    public MusicPlayer() {

    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic(MusicStyle musicStyle) {
        return musicStyle.toString().equals("classicalMusic") ? music1.getSong() : music2.getSong();
    }
}
