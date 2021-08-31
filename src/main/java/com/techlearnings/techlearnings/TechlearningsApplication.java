package com.techlearnings.techlearnings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "com.techlearnings")
@SpringBootApplication
public class TechlearningsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechlearningsApplication.class, args);
	}

}
