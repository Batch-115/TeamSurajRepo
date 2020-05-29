package com.webcore.app.easyemi.paymentOption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class PaymentOptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentOptionApplication.class, args);
	}

}
