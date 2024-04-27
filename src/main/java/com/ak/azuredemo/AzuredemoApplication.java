package com.ak.azuredemo;

import com.microsoft.applicationinsights.attach.ApplicationInsights;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzuredemoApplication {

	public static void main(String[] args) {
		ApplicationInsights.attach();

		SpringApplication.run(AzuredemoApplication.class, args);
	}

}