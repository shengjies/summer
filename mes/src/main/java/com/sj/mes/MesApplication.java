package com.sj.mes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sj"})
public class MesApplication {
    public static void main(String[] args) {
        SpringApplication.run(MesApplication.class,args);
    }
}
