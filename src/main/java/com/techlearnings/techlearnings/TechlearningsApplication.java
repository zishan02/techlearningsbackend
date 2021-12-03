package com.techlearnings.techlearnings;

import com.techlearnings.Repository.TechLearningsPostRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@ComponentScan(basePackages = "com.techlearnings")
@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = TechLearningsPostRepo.class)
public class TechlearningsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechlearningsApplication.class, args);
	}

}
