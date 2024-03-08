package com.registration.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude=(DataSourceAutoConfiguration.class))
public class RegistrationApp1Application {

	//Inworking final crud operation using rest api
	public static void main(String[] args) {
		SpringApplication.run(RegistrationApp1Application.class, args);
	}

}
