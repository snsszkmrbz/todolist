package com.ballikaya.todolist.service.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
//@EnableAutoConfiguration
@EnableJpaRepositories(basePackages="com.ballikaya.todolist")
public class RepositoryConfig {
}