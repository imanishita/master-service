package com.harmonique.masters.master_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableCaching
@ComponentScan(basePackages = {
		"com.harmonique.masters.master_service",
		"com.example.demo.util"
})

public class MasterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterServiceApplication.class, args);
	}

}
