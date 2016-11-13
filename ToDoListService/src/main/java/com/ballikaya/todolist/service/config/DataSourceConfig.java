package com.ballikaya.todolist.service.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
    
    @Bean(destroyMethod="close")
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/todolist");
        dataSource.setUsername("root");
        dataSource.setPassword("abcd_1235");
        dataSource.setMaxActive(100);
        dataSource.setMaxIdle(30);
        dataSource.setMaxWait(20000);
        return dataSource;
    }
    
}