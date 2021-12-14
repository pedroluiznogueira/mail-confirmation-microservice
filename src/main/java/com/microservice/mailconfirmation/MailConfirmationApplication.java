package com.microservice.mailconfirmation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MailConfirmationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailConfirmationApplication.class, args);
	}

}
