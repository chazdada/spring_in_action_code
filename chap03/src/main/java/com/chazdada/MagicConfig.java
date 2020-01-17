package com.chazdada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
@Conditional(MagicExistsCondition.class)
public class MagicConfig {


    @Bean
    @Profile("dev")
    public MagicBean magicBean(){

        return new MagicBean();
    }
}
