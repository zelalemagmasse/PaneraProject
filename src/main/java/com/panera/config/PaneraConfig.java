package com.panera.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.panera.config,com.panera.repo,com.panera.service"})
public class PaneraConfig {

}
