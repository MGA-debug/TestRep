package ru.appline.gordeev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gordeev-ma 26.06.2022
 **/

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        System.out.println(musicPlayer.playMusic(MusicStyle.CLASSICAL_MUSIC));
        context.close();
    }
}
