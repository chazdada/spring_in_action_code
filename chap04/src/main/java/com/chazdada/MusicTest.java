package com.chazdada;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Test;

@RunWith(SpringJUnit4ClassRunner.class) // 自动创建应用上下文
//@ContextConfiguration(classes = ConcertConfig.class) // 加载配置文件
@ContextConfiguration(classes = ConcertConfig2.class)
public class MusicTest{
    @Autowired
    Performance performance;

    @Test
    public void testMusic(){
        performance.perform();
    }
}
