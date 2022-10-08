package ru.appline.gordeev;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author gordeev-ma 26.06.2022
 **/

@Component
public class ClassicalMusic implements Music {

    List<String> songs = Arrays.asList("classicalSong1", "classicalSong2", "classicalSong3");

    private ClassicalMusic() {
    }

    @Override
    public String getSong() {
        Random random = new Random();
        int val = random.nextInt();
        return val > 0 ? songs.get(0) : val < 0 ? songs.get(1) : songs.get(2);
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Делаю инициализацию");
    }

    public void doMyDestroy() {
        System.out.println("Ломаю бин пополам");
    }
}
