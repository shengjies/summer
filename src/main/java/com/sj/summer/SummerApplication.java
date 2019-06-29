package com.sj.summer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sj"})
public class SummerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SummerApplication.class,args);
    }
}
