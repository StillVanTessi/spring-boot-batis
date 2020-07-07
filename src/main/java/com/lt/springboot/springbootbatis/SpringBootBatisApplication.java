package com.lt.springboot.springbootbatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

//@MapperScan扫描目录下所有的mapper
@MapperScan(value = "com.lt.springboot.springbootbatis.mapper")
@SpringBootApplication
public class SpringBootBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBatisApplication.class, args);
    }

}
