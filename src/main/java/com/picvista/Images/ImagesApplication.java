package com.picvista.Images;

import com.picvista.Images.Repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableMongoRepositories
public class ImagesApplication {

	@Autowired
	ImageRepository imageRepository;

	public static void main(String[] args) {
		SpringApplication.run(ImagesApplication.class, args);
	}

}
