package ru.maxima.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.maxima.spring.player.ClassicalMusic;
import ru.maxima.spring.player.Music;
import ru.maxima.spring.player.MusicPlayer;
import ru.maxima.spring.player.RockMusic;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("music", ClassicalMusic.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.play();

        context.close();
    }
}
