package com.chazdada.xml.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;


public class CDPlayer {
    private CompactDisc cd;

    @Autowired(required = false)
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    public void play(){
        cd.play();
    }
}