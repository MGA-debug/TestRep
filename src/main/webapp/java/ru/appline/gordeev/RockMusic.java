package ru.appline.gordeev;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author gordeev-ma 26.06.2022
 **/

@Component
public class RockMusic implements Music {

    List<String> songs = Arrays.asList("rockSong1", "rockSong2", "rockSong3");

    @Override
    public String getSong() {
        Random random = new Random();
        int val = random.nextInt();
        return val > 0 ? songs.get(0) : val < 0 ? songs.get(1) : songs.get(2);
    }
}
