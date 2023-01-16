package com.ioc.constructor.injection.IOCConstructorInjection.jdbctemplate;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class Config {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create()
                .driverClassName("driver_class_name")
                .username("user_name")
                .password("password")
                .url("http://localhost:6603/mytestDB");

        return dataSourceBuilder.build();
    }
}
