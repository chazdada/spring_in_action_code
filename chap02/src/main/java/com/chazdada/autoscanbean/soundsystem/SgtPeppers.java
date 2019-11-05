package com.chazdada.autoscanbean.soundsystem;


import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Peppers";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("title:"+title+"artist:"+artist);
    }
}
