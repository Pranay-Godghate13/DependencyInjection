package com.beandemo.beandemo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class AppConfig {
    @Bean
    public Samsung samsung()
    {
        return new Samsung();
    }
}
