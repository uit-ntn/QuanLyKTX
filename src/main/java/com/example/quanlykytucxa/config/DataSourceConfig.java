package com.example.quanlykytucxa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean(name = "oracleDataSource")
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .driverClassName("oracle.jdbc.OracleDriver")
                .url("jdbc:oracle:thin:@localhost:1521:orcl")
                .username("c##quanlyktx")
                .password("123456")
                .build();
    }
}
