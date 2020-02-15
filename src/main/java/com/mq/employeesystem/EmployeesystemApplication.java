package com.mq.employeesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class EmployeesystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesystemApplication.class, args);
	}
	
}
