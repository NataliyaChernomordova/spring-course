package ru.maxima.spring.player;

public class MusicPlayer {
    public ClassicalMusic classicalMusic;
    public RockMusic rockMusic;

    public void play(){
        classicalMusic = new ClassicalMusic();
        rockMusic = new RockMusic();
        System.out.println("Now playing " + rockMusic.getSong());
        System.out.println("Now playing " + classicalMusic.getSong());
    }
}
