package com.chazdada.autoscanbean.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.chazdada.autoscanbean.soundsystem") //默认扫描与配置类相同包下的组件
public class CDPlayerConfig {
}
