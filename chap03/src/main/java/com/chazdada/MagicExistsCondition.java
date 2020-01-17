package com.chazdada;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Properties;

public class MagicExistsCondition implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        Environment env = conditionContext.getEnvironment();
        ConfigurableEnvironment c = (ConfigurableEnvironment) env;
        MutablePropertySources m = c.getPropertySources();
        Properties p = new Properties();
        p.put("magic","123");
        m.addFirst(new PropertiesPropertySource("defaultProperties", p));
        System.out.println(env.containsProperty("magic"));

        return env.containsProperty("magic");
    }
}
