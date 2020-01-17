package com.chazdada;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Properties;

@RunWith(SpringJUnit4ClassRunner.class) // 自动创建应用上下文
@ContextConfiguration(classes = MagicConfig.class) // 加载配置文件
public class MagicTest {


    @Autowired
    MagicBean magicBean;

    @Test
    public void test(){

        magicBean.magic();
      }
}
