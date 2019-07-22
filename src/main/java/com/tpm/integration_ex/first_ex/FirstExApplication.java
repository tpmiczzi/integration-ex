package com.tpm.integration_ex.first_ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("/first_ex/first_ex.xml")
public class FirstExApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstExApplication.class, args);
	}

}
