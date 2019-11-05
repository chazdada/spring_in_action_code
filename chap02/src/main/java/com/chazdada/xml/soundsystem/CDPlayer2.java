package com.chazdada.xml.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;


public class CDPlayer2 {
    private CompactDisc cd;

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    public void play(){
        cd.play();
    }
}