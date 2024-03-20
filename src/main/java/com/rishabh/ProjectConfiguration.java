package com.rishabh;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.rishabh.proxies", "com.rishabh.repositories", "com.rishabh.services"})
public class ProjectConfiguration {
}
