package com.alex.pgmaster.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static freemarker.template.Configuration.SQUARE_BRACKET_INTERPOLATION_SYNTAX;

@Configuration
public class FreemarkerConfig {

    @Bean
    public freemarker.template.Configuration freemarkerConfiguration() {
        freemarker.template.Configuration cfg = new freemarker.template.Configuration();
        cfg.setInterpolationSyntax(SQUARE_BRACKET_INTERPOLATION_SYNTAX);
        return cfg;
    }

}
