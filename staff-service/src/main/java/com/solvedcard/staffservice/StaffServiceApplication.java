package com.solvedcard.staffservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.solvedcard.core.repositories"})
@ComponentScan(basePackages = {"com.solvedcard"})
@EntityScan("com.solvedcard.beans.entities")
public class StaffServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StaffServiceApplication.class, args);
    }

}
