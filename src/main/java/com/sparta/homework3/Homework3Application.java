package com.sparta.homework3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@EnableJpaAuditing
@SpringBootApplication
public class Homework3Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework3Application.class, args);
    }

    @PostConstruct
    public void recordTime() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
    }

}
