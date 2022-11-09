package com.logtry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages=("com.logtry"))
public class MultilogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultilogApplication.class, args);
	}

}
