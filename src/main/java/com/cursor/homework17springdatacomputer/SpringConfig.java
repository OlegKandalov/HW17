package com.cursor.homework17springdatacomputer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.cursor.homework17springdatacomputer")
@EnableJpaRepositories("com.cursor.homework17springdatacomputer.repository")
@PropertySource("classpath:application.properties")
public class SpringConfig {
}
