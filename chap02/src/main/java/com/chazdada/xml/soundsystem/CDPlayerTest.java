package com.chazdada.xml.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // 自动创建应用上下文
@ContextConfiguration(classes = CDPlayerConfig.class) // 加载配置文件
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;

    @Autowired
    private CDPlayer cdPlayer;

    @Autowired
    private CDPlayer2 cdPlayer2;

    @Test
    public void cdShouldNotBeNull(){
        cd.play();
        cdPlayer.play();
        cdPlayer2.play();
    }

}
