package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class FirstApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApiApplication.class, args);
	}

    @Bean
    CommandLineRunner testDatabsesConnection(DataSource dataSource){
        return args -> {
            System.out.println("Databse connection Successfully");
            System.out.println("Databse url "+dataSource.getConnection().getMetaData().getURL());

        };

    }

}
