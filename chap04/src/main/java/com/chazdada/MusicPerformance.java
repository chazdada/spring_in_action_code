package com.chazdada;

import org.springframework.stereotype.Component;

@Component
public class MusicPerformance implements Performance {
    static {
        System.out.println("123");
    }

    public void perform() {
        System.out.println("music <><><><><><><><><>");
    }
}
